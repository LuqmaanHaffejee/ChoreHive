import { inject, Injectable } from '@angular/core';
import { HttpClient, HttpStatusCode } from "@angular/common/http";
import { BehaviorSubject, Observable, switchMap, tap } from "rxjs";
import { ApiPaths } from "./api-paths";
import { Task } from "../../model/task";

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private http = inject(HttpClient);

  private updateTasksSubject = new BehaviorSubject<void>(null);

  tasks$: Observable<Task[]> = this.updateTasksSubject.asObservable().pipe(
    switchMap(() => this.getAllTasks())
  );

  constructor() {
    this.updateTaskList();
  }

  updateTaskList() {
    this.updateTasksSubject.next();
  }

  getAllTasks(): Observable<Task[]> {
    return this.http.get<Task[]>(ApiPaths.BASE_TASK_URL);
  }

  addNewTask(newTask: { summary: string, description: string }) {
    return this.http.post<HttpStatusCode>(ApiPaths.BASE_TASK_URL, newTask).pipe(tap(() => this.updateTaskList()));
  }
}
