import { Component, inject } from '@angular/core';
import { AccordionModule } from "primeng/accordion";
import { AsyncPipe, NgForOf, NgIf } from "@angular/common";
import { TaskService } from "../../../service/data-access/task.service";
import { StyleClassModule } from "primeng/styleclass";

@Component({
  selector: 'app-task-list',
  standalone: true,
  imports: [
    AccordionModule,
    AsyncPipe,
    NgForOf,
    NgIf,
    StyleClassModule
  ],
  templateUrl: './task-list.component.html',
  styleUrl: './task-list.component.css'
})
export class TaskListComponent {

  taskService = inject(TaskService);

  tasks$ = this.taskService.tasks$;

}
