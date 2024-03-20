import { Component } from '@angular/core';
import { CardModule } from "primeng/card";
import { ButtonModule } from "primeng/button";
import { RippleModule } from "primeng/ripple";
import { StyleClassModule } from "primeng/styleclass";
import { RouterLink } from "@angular/router";
import { Paths } from "../../paths";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    CardModule,
    ButtonModule,
    RippleModule,
    StyleClassModule,
    RouterLink
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

  tasks = `/${Paths.TASKS}`;
}
