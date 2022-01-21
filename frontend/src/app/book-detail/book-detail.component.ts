import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Params} from "@angular/router";
import {BookService} from "../shared/book.service";
import {Book} from "../shared/book";

@Component({
  selector: 'app-book-detail',
  templateUrl: './book-detail.component.html',
  styleUrls: ['./book-detail.component.css']
})
export class BookDetailComponent implements OnInit {
  currentBook?: Book;
  constructor(private route: ActivatedRoute, private bookService: BookService) { }

  ngOnInit(): void {
    this.route.params.subscribe(
      (params: Params) => {
        this.currentBook = this.bookService.getBookByIsbn(params['isbn']);
      }
    )
  }

}
