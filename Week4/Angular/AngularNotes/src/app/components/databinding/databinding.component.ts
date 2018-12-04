import { Component, OnInit } from '@angular/core';
import { LoggingService } from '../../services/logging.service';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css'],
  providers: [LoggingService]
})
export class DatabindingComponent implements OnInit {

  title = `Interpolation`;

  interpolationNotation = `{{}}`;

  interpolation = `Welcom to the Interpolation`;

  propertyBindingNotation = `[]`;

  eventBindingNotation = `()`;

  twoWayBindingNotation = `[()]`;

  counter = 0;

  text = '';

  styleState = {
    color: `red`,
    backgroundColor: `blue`,
    border: `1px solid black`,
    cursor: `pointer `,
    margin: `2px`
  };

  changeStyles(): void {

    this.logger.info('Inside changeStyles method');

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
    this.logger.warn('The counter has been incremented');
    this.counter++;
  }

  constructor(private logger: LoggingService) { }

  ngOnInit() {
  }



}
