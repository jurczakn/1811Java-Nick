import { Component, OnInit } from '@angular/core';

import { AuthorService } from '../author.service';
import { UserService } from '../user.service';

import { Author } from '../author';

@Component({
  selector: 'app-author-list',
  templateUrl: './author-list.component.html',
  styleUrls: ['./author-list.component.css']
})
export class AuthorListComponent implements OnInit {
  public authors: Author[];

  constructor(
    private authorService: AuthorService,
    private userService: UserService
  ) { }

  ngOnInit() {
    this.authorService.getAuthors()
    .subscribe( authorList => this.authors = authorList );
  }

  isEmployee(): boolean {
    return this.userService.isEmployee();
  }

}
