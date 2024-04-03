import { Component, inject } from '@angular/core';
import { InputTextModule } from "primeng/inputtext";
import { FormBuilder, FormControl, ReactiveFormsModule, Validators } from "@angular/forms";
import { InputTextareaModule } from "primeng/inputtextarea";
import { ButtonModule } from "primeng/button";
import { TaskService } from "../../../service/data-access/task.service";
import { catchError, NEVER, Observable, throwError } from "rxjs";
import { MessageService } from "primeng/api";
import { MessagesModule } from "primeng/messages";
import { HttpErrorResponse, HttpResponse } from "@angular/common/http";
import { Task } from "../../../model/task";

@Component({
  selector: 'app-add-task',
  standalone: true,
  imports: [
    InputTextModule,
    ReactiveFormsModule,
    InputTextareaModule,
    ButtonModule,
    MessagesModule
  ],
  providers: [MessageService],
  templateUrl: './add-task.component.html',
  styleUrl: './add-task.component.css'
})
export class AddTaskComponent {

  taskService = inject(TaskService);

  fb = inject(FormBuilder);

  addTaskForm = this.fb.group({
    summary: this.fb.control<string>(null, {validators: Validators.required}),
    description: this.fb.control<string>(null, {validators: Validators.required}),
  });

  onSubmit() {
    this.taskService.addNewTask(this.addTaskForm.getRawValue());
  }
}
