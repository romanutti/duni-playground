import {Component, Input, OnInit} from '@angular/core';
import {Book} from "../shared/book";

@Component({
  selector: 'app-book-item',
  templateUrl: './book-item.component.html',
  styleUrls: ['./book-item.component.css']
})
export class BookItemComponent implements OnInit {

  @Input() currentBook?: Book;

  constructor() {}

  ngOnInit(): void {
    console.log(this.currentBook);
  }

}
