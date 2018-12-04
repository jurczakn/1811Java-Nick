import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural',
  templateUrl: './structural.component.html',
  styleUrls: ['./structural.component.css']
})
export class StructuralComponent implements OnInit {

  arrayOfThings = [`5 legs`, `6 legs`, `10 legs`, `no legs`, `27 legs`, `five thousand legs`];

  constructor() { }

  ngOnInit() {
  }

}
