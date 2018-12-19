import { Component, OnInit, Input } from '@angular/core';
import { AuthorService } from '../author.service';
import { UserService } from '../user.service';

import { Author } from '../author';

@Component({
  selector: 'app-author',
  templateUrl: './author.component.html',
  styleUrls: ['./author.component.css']
})
export class AuthorComponent implements OnInit {
  @Input() openAuthor: Author;
  constructor(
    private authorService: AuthorService,
    private userService: UserService
  ) { }

  ngOnInit(): void {
    if ( !this.openAuthor ) {
      this.openAuthor = new Author();
    }
  }
  updateAuthor(): void {
    console.log(this.openAuthor);
    this.authorService.updateAuthor(this.openAuthor)
    .subscribe(
      author => this.openAuthor = author
    );
  }
  isEmployee(): boolean {
    return this.userService.isEmployee();
  }
}
