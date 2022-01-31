import { Injectable } from '@angular/core';
import {Book} from "./book";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class BookService {

  books: Book[] = [];

  constructor(private httpClient: HttpClient) {
  }

  getAllBooks(): Observable<Book[]> {
    return this.httpClient.get<any[]>('/api/books');
  }

  getBookByIsbn(isbn: string): Book | undefined {
    return this.books.find((book: Book) => book.isbn === isbn);
  }

}
