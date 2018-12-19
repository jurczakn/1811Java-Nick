import { Injectable } from '@angular/core';
import { Headers, Http, RequestOptions } from '@angular/http';

import { Observable } from 'rxjs/observable';
import { of } from 'rxjs/observable/of';
import 'rxjs/add/operator/map';

import { Author } from './author';

@Injectable()
export class AuthorService {
  private appUrl = 'http://localhost:8080/BookStore/authors';
  private headers = new Headers({'Content-Type': 'application/json'  });

  constructor(private http: Http) { }

  getAuthors(): Observable<Author[]> {
      return this.http.get(this.appUrl, { withCredentials: true })
      .map(
          resp => resp.json() as Author[]
      );
  }

  updateAuthor(author: Author): Observable<Author> {
    const body = JSON.stringify(author);
    console.log(body);
    if (!author.id) {
      console.log('creating author');
      return this.http.post(this.appUrl, body, { headers: this.headers, withCredentials: true })
      .map(
          resp => resp.json() as Author
      );
    }
    const url = this.appUrl + '/' + author.id;
    return this.http.put(url, body, { headers: this.headers, withCredentials: true })
    .map(
        resp => resp.json() as Author
    );
  }
}
