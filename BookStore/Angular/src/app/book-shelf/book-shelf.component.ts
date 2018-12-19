import { Component, OnInit } from '@angular/core';

import { BookService } from '../book.service';
import { UserService } from '../user.service';

import { Book } from '../book';

@Component({
  selector: 'app-book-shelf',
  templateUrl: './book-shelf.component.html',
  styleUrls: ['./book-shelf.component.css']
})
export class BookShelfComponent implements OnInit {
  public books: Book[];
  public searchBar: string;
  constructor(
    private bookService: BookService,
    private userService: UserService
  ) { }

  ngOnInit() {
    this.bookService.getBooks()
    .subscribe( bookList => this.books = bookList );
    this.searchBar = '';
  }

}
