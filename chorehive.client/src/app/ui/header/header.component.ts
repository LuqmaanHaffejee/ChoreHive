import { Component } from '@angular/core';
import { MenubarModule } from "primeng/menubar";
import { MenuItem } from "primeng/api";
import { Paths } from "../../paths";

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [
    MenubarModule
  ],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {

  menuItems: MenuItem[] = [
    {
      label: 'My Tasks',
      icon: 'pi pi-check-square',
      routerLink: Paths.TASKS
    }
  ];



}
