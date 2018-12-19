import { Component, OnInit } from '@angular/core';

import { UserService } from '../user.service';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {
  title = 'Lurkon\'s books';
  constructor(
    private userService: UserService
  ) { }

  ngOnInit() {
  }

  isEmployee(): boolean {
    return this.userService.isEmployee();
  }

  isCustomer(): boolean {
    return this.userService.isCustomer();
  }
}
