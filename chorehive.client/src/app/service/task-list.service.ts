import { BehaviorSubject } from "rxjs";

export class TaskListService {

  private activeTaskIndexSubject = new BehaviorSubject<number>(0);

  activeTaskIndex$ = this.activeTaskIndexSubject.asObservable();

  updateActiveTaskIndex(newIndex: number) {
    this.activeTaskIndexSubject.next(newIndex);
  }

}
