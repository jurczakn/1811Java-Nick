import { Injectable } from '@angular/core';
import { Headers, Http, RequestOptions } from '@angular/http';

import { Observable } from 'rxjs/observable';
import { of } from 'rxjs/observable/of';
import 'rxjs/add/operator/map';

import { Book } from './book';

@Injectable()
export class BookService {
    private appUrl = 'http://localhost:8080/BookStore/books';
    private headers = new Headers({'Content-Type': 'application/json' });

    constructor(private http: Http) { }

    getBooks(): Observable<Book[]> {
        return this.http.get(this.appUrl, { withCredentials: true })
        .map(
            resp => resp.json() as Book[]
        );
    }

    getBook(id: number): Observable<Book> {
        const url: string = this.appUrl + '/' + id;
        return this.http.get(url, { withCredentials: true })
        .map(
            resp => resp.json() as Book
        );
    }

    updateBook(book: Book): Observable<Book> {
        const body = JSON.stringify(book);
        if (book.id) {
            // update (put)
            const url = this.appUrl + '/' + book.id;
            return this.http.put(url, body, { headers: this.headers, withCredentials: true })
            .map(
                resp => resp.json() as Book
            );
        } else {
            // create (post)
            return this.http.post(this.appUrl, body, { headers: this.headers, withCredentials: true })
            .map(
                resp => resp.json() as Book
            );
        }
    }
}
