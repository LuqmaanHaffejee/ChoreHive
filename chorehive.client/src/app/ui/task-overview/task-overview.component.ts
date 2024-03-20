import { Component, inject } from '@angular/core';
import { CardModule } from "primeng/card";
import { AccordionModule } from "primeng/accordion";
import { TaskListComponent } from "./task-list/task-list.component";
import { AsyncPipe, NgForOf, NgIf } from "@angular/common";
import { ButtonModule } from "primeng/button";
import { DialogService } from "primeng/dynamicdialog";
import { AddTaskComponent } from "./add-task/add-task.component";
import { FormBuilder, Validators } from "@angular/forms";

@Component({
  selector: 'app-task-overview',
  standalone: true,
  imports: [
    CardModule,
    AccordionModule,
    TaskListComponent,
    AsyncPipe,
    NgForOf,
    NgIf,
    ButtonModule
  ],
  providers: [DialogService],
  templateUrl: './task-overview.component.html',
  styleUrl: './task-overview.component.css'
})
export class TaskOverviewComponent {

  dialogService = inject(DialogService);

  onAddTask() {
    this.dialogService.open(AddTaskComponent, {
      header: 'Add new task',
      width: '60vw',
      closable: true,
    });
  }
}
