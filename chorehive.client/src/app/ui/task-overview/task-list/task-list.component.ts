import { Component, inject } from '@angular/core';
import { AccordionModule } from "primeng/accordion";
import { AsyncPipe, NgClass, NgForOf, NgIf, NgStyle } from "@angular/common";
import { TaskService } from "../../../service/data-access/task.service";
import { StyleClassModule } from "primeng/styleclass";
import { ButtonModule } from "primeng/button";
import { TaskListService } from "../../../service/task-list.service";

@Component({
  selector: 'app-task-list',
  standalone: true,
  imports: [
    AccordionModule,
    AsyncPipe,
    NgForOf,
    NgIf,
    StyleClassModule,
    ButtonModule,
    NgClass,
    NgStyle
  ],
  templateUrl: './task-list.component.html',
  styleUrl: './task-list.component.css',
  providers: [TaskListService]
})
export class TaskListComponent {

  taskService = inject(TaskService);

  taskListService = inject(TaskListService);

  tasks$ = this.taskService.tasks$;

  activeTaskIndex$ = this.taskListService.activeTaskIndex$;

  onToggleCompletionStatus(taskId: number) {
    this.taskService.toggleCompletionStatus(taskId);
  }

  onTabSelected(selectedTabIndex: number) {
    this.taskListService.updateActiveTaskIndex(selectedTabIndex);
  }
}
