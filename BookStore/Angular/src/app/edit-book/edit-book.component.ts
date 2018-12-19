import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Location } from '@angular/common';

import { BookService } from '../book.service';
import { AuthorService } from '../author.service';
import { GenreService } from '../genre.service';

import { Book } from '../book';
import { Author } from '../author';
import { Genre } from '../genre';

import 'rxjs/add/operator/switchMap';

@Component({
  selector: 'app-edit-book',
  templateUrl: './edit-book.component.html',
  styleUrls: ['./edit-book.component.css']
})
export class EditBookComponent implements OnInit {

  public openBook: Book;
  private authorList: Author[];
  private genreList: Genre[];

  constructor(
    private bookService: BookService,
    private authorService: AuthorService,
    private genreService: GenreService,
    private route: ActivatedRoute,
    private router: Router,
    private location: Location
  ) { }

  ngOnInit(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    if (id) {
      this.route.paramMap.switchMap((params: ParamMap) =>
        this.bookService.getBook(+params.get('id')))
        .subscribe(book => {
          // set current book to the book retrieved
          this.openBook = book;
          // retrieve all authors and splice authors out of the list
          this.authorService.getAuthors().subscribe(
            authors => {
              this.authorList = authors;
              if (this.openBook.authors) {
                this.openBook.authors.forEach(
                  author => this.authorList.splice(this.authorList.indexOf(author), 1)
                );
              }
            }
          );
          // retrieve all genres and splice genres out of the list
          this.genreService.getGenres().subscribe(
            genres => {
              this.genreList = genres;
              if (this.openBook.genres) {
                this.openBook.genres.forEach(
                  genre => this.genreList.splice(this.genreList.indexOf(genre), 1)
                );
              }
            }
          );
        } );
    } else {
      this.openBook = new Book();
      this.authorService.getAuthors().subscribe(
        authors => this.authorList = authors
      );
      this.genreService.getGenres().subscribe(
        genres => this.genreList = genres
      );
    }
  }

  addAuthor(a: Author): void {
    console.log(a);
    this.openBook.authors.push(a);
    this.authorList.splice(this.authorList.indexOf(a), 1);
  }

  removeAuthor(a: Author): void {
    console.log(a);
    this.openBook.authors.splice(this.openBook.authors.indexOf(a), 1);
    this.authorList.push(a);
  }

  addGenre(g: Genre): void {
    console.log(g);
    this.openBook.genres.push(g);
    this.genreList.splice(this.genreList.indexOf(g), 1);
  }

  removeGenre(g: Genre): void {
    this.openBook.genres.splice(this.openBook.genres.indexOf(g), 1);
    this.genreList.push(g);
  }

  submit(): void {
    this.bookService.updateBook(this.openBook)
      .subscribe(
      book => {
        this.openBook = book;
        this.router.navigate(['/books']);
      }
      );
  }
}
