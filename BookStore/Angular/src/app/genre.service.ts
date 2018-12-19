import { Injectable } from '@angular/core';
import { Headers, Http, RequestOptions } from '@angular/http';

import { Observable } from 'rxjs/observable';
import { of } from 'rxjs/observable/of';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import { Genre } from './genre';

@Injectable()
export class GenreService {

  private appUrl = 'http://localhost:8080/BookStore/genres';
  private headers = new Headers({'Content-Type': 'application/json' });

  constructor(private http: Http) { }
  getGenres(): Observable<Genre[]> {
    return this.http.get(this.appUrl, { withCredentials: true })
    .map(
        resp => resp.json() as Genre[]
    );
  }

  getGenre(id: number): Observable<Genre> {
    const url = this.appUrl + '/' + id;
    return this.http.get(url, { withCredentials: true })
    .map(
      resp => resp.json() as Genre);
    // ).catch( this.handleError(error) );
  }

  updateGenre(genre: Genre): Observable<Genre> {
    const body = JSON.stringify(genre);
    if (genre.id) {
        // update (put)
        const url = this.appUrl + '/' + genre.id;
        return this.http.put(url, body, { headers: this.headers, withCredentials: true })
        .map(
            resp => resp.json() as Genre
        );
    } else {
        // create (post)
        return this.http.post(this.appUrl, body, { headers: this.headers, withCredentials: true })
        .map(
            resp => resp.json() as Genre
        );
    }
  }
  handleError(error: Response): Observable<Genre> {
    console.error(error);
    return Observable.throw(new Genre());
  }
}
