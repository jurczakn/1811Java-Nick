import { Injectable } from '@angular/core';
import { Headers, Http, RequestOptions } from '@angular/http';

import { Observable } from 'rxjs/observable';
import { of } from 'rxjs/observable/of';
import 'rxjs/add/operator/map';

import { Book } from './book';
import { Purchase } from './purchase';
import { Customer } from './customer';

@Injectable()
export class PurchaseService {

  private appUrl = 'http://localhost:8080/BookStore/purchases';
  private headers = new Headers({'Content-Type': 'application/json' });

  constructor(private http: Http) { }
  getPurchases(): Observable<Purchase[]> {
    return this.http.get(this.appUrl, { withCredentials: true })
    .map(
        resp => resp.json() as Purchase[]
    );
  }

  getPurchase(id: number): Observable<Purchase> {
    const url = this.appUrl + '/' + id;
    return this.http.get(url, { withCredentials: true })
    .map(
      resp => resp.json() as Purchase
    );
  }

  updatePurchase(purch: Purchase): Observable<Purchase> {
    const url = this.appUrl + '/' + purch.id;
    const body = JSON.stringify(purch);
    return this.http.put(url, body, { headers: this.headers, withCredentials: true })
    .map(
      resp => resp.json() as Purchase
    );
  }

  /*
   Sending a post request to /purchases results in retrieving a purchase which is labeled as "OPEN"
  */
  createPurchase(): Observable<Purchase> {
    const body = '{}';
    return this.http.post(this.appUrl, body, { headers: this.headers, withCredentials: true })
    .map(
      resp => resp.json() as Purchase
    );
  }

  addBook(purchase: Purchase, book: Book): Observable<Purchase> {
    const body = {};
    const url = this.appUrl + '/' + purchase.id + '/book/' + book.id;
    console.log(url);
    return this.http.put(url, body, { headers: this.headers, withCredentials: true })
    .map(
      resp => resp.json() as Purchase
    );
  }
  subBook(purchase: Purchase, book: Book): Observable<Purchase> {
    const url = this.appUrl + '/' + purchase.id + '/book/' + book.id;
    console.log(url);
    return this.http.delete(url, { headers: this.headers, withCredentials: true })
    .map(
      resp => resp.json() as Purchase
    );
  }
  emptyCart(purchase: Purchase): Observable<Object> {
    const url = this.appUrl + '/' + purchase.id;
    console.log(url);
    return this.http.delete(url, { headers: this.headers, withCredentials: true})
    .map(
      resp => resp
    );
  }
}
