import { Routes } from '@angular/router';
import { HomeComponent } from "./ui/home/home.component";
import { TaskOverviewComponent } from "./ui/task-overview/task-overview.component";

export const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'home'
  },
  {
    path: 'home',
    pathMatch: 'full',
    component: HomeComponent
  },
  {
    path: 'tasks',
    pathMatch: 'full',
    component: TaskOverviewComponent
  }
];
