import { Component, OnInit } from '@angular/core';

import { PurchaseService } from '../purchase.service';
import { UserService } from '../user.service';

import { Book } from '../book';
import { Purchase } from '../purchase';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  public purchases: Purchase[];

  constructor(
    private purchaseService: PurchaseService,
    private userService: UserService
  ) { }

  ngOnInit() {
    this.purchaseService.getPurchases()
      .subscribe(purchaseList => this.purchases = purchaseList);

  }

}
