import { inject, Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { ApiPath } from "./api-path";
import { Note } from "../model/note";

@Injectable({
  providedIn: 'root'
})
export class NoteService {

  private http = inject(HttpClient);

  getAllNotes(): Observable<Note> {
    return this.http.get<Note>(ApiPath.BASE_NOTE);
  }

}
