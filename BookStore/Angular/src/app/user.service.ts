import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';

import { Observable } from 'rxjs/observable';
import { of } from 'rxjs/observable/of';
import 'rxjs/add/operator/map';

import { Employee } from './employee';
import { User } from './user';
import { Customer } from './customer';
import { CurrentUser } from './current-user';

@Injectable()
export class UserService {
  private appUrl = 'http://localhost:8080/BookStore/login';
  private headers = new Headers({ 'Content-Type': 'application/x-www-form-urlencoded'});
  private employee: Employee;
  private customer: Customer;

  constructor(private http: Http) { }

  login(username: string, password: string): Observable<CurrentUser> {
    if (username && password) {
      const body = `user=${username}&pass=${password}`;
      return this.http.post(this.appUrl, body, { headers: this.headers, withCredentials: true })
        .map(
        resp => {
          const user: CurrentUser = resp.json() as CurrentUser;
          this.employee = user.employee;
          this.customer = user.customer;
          return user;
        }
        );
    } else {
      return this.http.get(this.appUrl, {headers: this.headers, withCredentials: true })
      .map(
        resp => {
          const user: CurrentUser = resp.json() as CurrentUser;
          this.employee = user.employee;
          this.customer = user.customer;
          return user;
        }
      );
    }
  }

  logout(): Observable<number> {
    console.log('logout called');
    return this.http.delete(this.appUrl, { withCredentials: true })
      .map(
      success => {
        this.employee = null;
        this.customer = null;
        return success.status;
      }
      );
  }

  getCustomer(): Customer {
    return this.customer;
  }
  getEmployee(): Employee {
    return this.employee;
  }

  isEmployee() {
    return (this.employee !== undefined && this.employee !== null);
  }
  isCustomer() {
    return (this.customer !== undefined && this.customer !== null);
  }
}
