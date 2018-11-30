import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MotorcycleComponent } from './components/motorcycle/motorcycle.component';

@NgModule({
  declarations: [
    AppComponent,
    MotorcycleComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
