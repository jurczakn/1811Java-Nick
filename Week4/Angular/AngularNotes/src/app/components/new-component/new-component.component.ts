import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../../services/user-service.service';
import { User } from '../../types/user';

@Component({
  selector: 'app-new-component',
  templateUrl: './new-component.component.html',
  styleUrls: ['./new-component.component.css']
})
export class NewComponentComponent implements OnInit {

  user: User;

  username: string;

  constructor(private userService: UserServiceService) { }

  ngOnInit() {
    this.user = new User();
  }

  findUser() {
    this.userService.getUser(this.username).subscribe(data => this.user = data);
  }

}
