import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent implements OnInit {

  title = `Interpolation`;

  interpolationNotation = `{{}}`;

  interpolation = `Welcom to the Interpolation`;

  propertyBindingNotation = `[]`;

  eventBindingNotation = `()`;

  counter = 0;

  styleState = {
    color: `red`,
    backgroundColor: `blue`,
    border: `1px solid black`,
    cursor: `pointer `,
    margin: `2px`
  };

  changeStyles(): void {

    if (this.styleState.color === `red`) {

      this.styleState.color = `#fff`;
      this.styleState.backgroundColor = `#000`;
      this.styleState.border = `3px groove green`;

    } else if (this.styleState.color === `#fff`) {

      this.styleState.color = `purple`;
      this.styleState.backgroundColor = `lime`;
      this.styleState.border = `5px ridge cyan`;

    } else {

      this.styleState.color = `red`;
      this.styleState.backgroundColor = `blue`;
      this.styleState.border = `1px solid black`;

    }

  }

  addToCounter(): void {
    this.counter++;
  }

  constructor() { }

  ngOnInit() {
  }



}
