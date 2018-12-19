import { Component, OnInit } from '@angular/core';

import { UserService } from '../user.service';
import { PurchaseService } from '../purchase.service';

import { CurrentUser } from '../current-user';
import { Purchase } from '../purchase';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  public loggedUser: CurrentUser;
  private username: string;
  private password: string;
  private myCart: Purchase;

  constructor(
    private userService: UserService,
    private purchaseService: PurchaseService
  ) { }

  ngOnInit(): void {
    this.userService.login(null, null).subscribe( user => {
      this.loggedUser = user;
      if (this.loggedUser.customer) {
        this.purchaseService.createPurchase()
        .subscribe(
          purchase => {
            this.myCart = purchase;
          }
        );
      }
    });
  }

  login(): void {
    console.log(this.username);
    this.userService.login(this.username, this.password)
    .subscribe( user => {
      this.loggedUser = user;
      if (this.loggedUser.customer) {
        this.purchaseService.createPurchase()
        .subscribe(
          purchase => {
            this.myCart = purchase;
          }
        );
      }
    });
  }

  logout(): void {
    this.userService.logout()
    .subscribe();
    this.loggedUser = null;
    this.username = null;
    this.password = null;
  }
}
