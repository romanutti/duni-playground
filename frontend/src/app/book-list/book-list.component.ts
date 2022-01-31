import { Component, OnInit } from '@angular/core';
import {Book} from "../shared/book";
import {BookService} from "../shared/book.service";

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
  books: Book[] = [];
  constructor(private bookService: BookService) { }

  ngOnInit(): void {
    this.bookService.getAllBooks().subscribe(books => {
      this.books = books;
    });

  }

}
