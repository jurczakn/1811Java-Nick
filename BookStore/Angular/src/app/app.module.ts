import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

// Custom Modules
import { AppRoutingModule } from './app-routing.module';

// Custom Components
import { AppComponent } from './app.component';
import { BookShelfComponent } from './book-shelf/book-shelf.component';
import { HomeComponent } from './home/home.component';
import { BookComponent } from './book/book.component';
import { EditBookComponent } from './edit-book/edit-book.component';
import { LoginComponent } from './login/login.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { CartComponent } from './cart/cart.component';
import { PurchaseComponent } from './purchase/purchase.component';
import { AuthorListComponent } from './author-list/author-list.component';
import { AuthorComponent } from './author/author.component';

// Custom Services
import { BookService } from './book.service';
import { UserService } from './user.service';
import { PurchaseService } from './purchase.service';
import { AuthorService } from './author.service';
import { GenreService } from './genre.service';

import { BookFilterPipe } from './book-filter.pipe';
import { GenreComponent } from './genre/genre.component';

import * as FusionCharts from 'fusioncharts';
import * as Charts from 'fusioncharts/fusioncharts.charts';
import * as FintTheme from 'fusioncharts/themes/fusioncharts.theme.fint';
import { FusionChartsModule } from 'angular4-fusioncharts';

FusionChartsModule.fcRoot(FusionCharts, Charts, FintTheme);

@NgModule({
  declarations: [
    AppComponent,
    BookShelfComponent,
    HomeComponent,
    BookComponent,
    NavBarComponent,
    BookFilterPipe,
    EditBookComponent,
    LoginComponent,
    CartComponent,
    PurchaseComponent,
    AuthorListComponent,
    AuthorComponent,
    GenreComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    AppRoutingModule,
    FusionChartsModule
  ],
  providers: [ BookService, UserService, PurchaseService, AuthorService, GenreService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
