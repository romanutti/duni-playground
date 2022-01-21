import { Injectable } from '@angular/core';
import {Book} from "./book";

@Injectable({
  providedIn: 'root'
})
export class BookService {

  books: Book[] = [];

  constructor() {
    this.books = [{
      "isbn":"978-1-4920-7698-8",
      "title":"Spring Boot: Up and Running",
      "authors":[
        "Mark Heckler", "Marco"
      ],
      "published":new Date("01.02.2021"),
      "subtitle":"Building Cloud Native Java and Kotlin Applications",
      "rating":5,
      "thumbnails":[
        {
          "url":"https://assets.thalia.media/img/artikel/fce0f87046dcbf48cb73e0d96eb8e758c2a31ab0-00-00.jpeg",
          "description":"Cover"
        }
      ],
      "description":"Spring Boot is the most widely used Java framework available. Its ease and power have revolutionized application development from monoliths to microservices. Yet Spring Boots simplicity can also be confounding. This practical book shows you how to use this framework to write successful mission-critical applications."
    }]
  }

  getAllBooks(): Book[] {
    return [...this.books];
  }

  getBookByIsbn(isbn: string): Book | undefined {
    return this.books.find((book: Book) => book.isbn === isbn);
  }

}
