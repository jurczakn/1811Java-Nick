import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Location } from '@angular/common';

import { BookService } from '../book.service';
import { UserService } from '../user.service';
import { PurchaseService } from '../purchase.service';

import { Book } from '../book';
import { Purchase } from '../purchase';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
  @Input() openBook: Book;
  constructor(
    private userService: UserService,
    private purchaseService: PurchaseService,
    private bookService: BookService,
    private route: ActivatedRoute,
    private router: Router,
    private location: Location
  ) { }

  ngOnInit() {
    const id = +this.route.snapshot.paramMap.get('id');

    if (id) {
      this.route.paramMap.switchMap((params: ParamMap) =>
        this.bookService.getBook(+params.get('id')))
        .subscribe(book => this.openBook = book);
    }
  }

  isCustomer(): boolean {
    return this.userService.isCustomer();
  }
  isEmployee(): boolean {
    return this.userService.isEmployee();
  }
  addToCart(): void {
    // add book to purchase, get purchase back
    this.purchaseService.createPurchase()
    .subscribe( purch => {
        // once the purchase has been returned, add the book to the purchase
        this.purchaseService.addBook(purch, this.openBook)
        .subscribe( updatedPurchase => {
          // once this is done, we must navigate
          this.router.navigate(['/purch', updatedPurchase.id]);
        });
      }
    );
  }
  editBook(): void {
    this.router.navigate(['/books/edit', this.openBook.id]);
  }
}
