import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { BookShelfComponent } from './book-shelf/book-shelf.component';
import { BookComponent } from './book/book.component';
import { EditBookComponent } from './edit-book/edit-book.component';
import { CartComponent } from './cart/cart.component';
import { AuthorListComponent } from './author-list/author-list.component';
import { PurchaseComponent } from './purchase/purchase.component';
import { GenreComponent } from './genre/genre.component';

const routes: Routes = [
    {
        path: '',
        redirectTo: '/home',
        pathMatch: 'full'
    },
    {
        path: 'home',
        component: HomeComponent
    },
    {
        path: 'books/edit/:id',
        component: EditBookComponent
    },
    {
        path: 'books/edit',
        component: EditBookComponent
    },
    {
        path: 'books/:id',
        component: BookComponent
    },
    {
        path: 'books',
        component: BookShelfComponent
    },
    {
        path: 'purch/:id',
        component: PurchaseComponent
    },
    {
        path: 'purch',
        component: CartComponent
    },
    {
        path: 'authors',
        component: AuthorListComponent
    },
    {
        path: 'genres',
        component: GenreComponent
    }
];

@NgModule({
    imports: [RouterModule.forRoot(routes) ],
    exports: [RouterModule]
})

export class AppRoutingModule {

}
