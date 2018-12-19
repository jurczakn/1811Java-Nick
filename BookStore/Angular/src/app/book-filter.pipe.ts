import { Pipe, PipeTransform } from '@angular/core';

import { Book } from './book';

@Pipe({
  name: 'bookFilter'
})
export class BookFilterPipe implements PipeTransform {

  transform(items: Book[], searchText: string): Book[] {
    if (!items) {
      return [];
    }
    searchText = searchText.toLowerCase();
    return items.filter( book => {
      const searchNumber: number = +searchText;
      let search: boolean;
      search = book.title.toLowerCase().includes(searchText)
      || book.price === searchNumber
      || book.stock === searchNumber
      || book.isbn10.includes(searchText)
      || book.isbn13.includes(searchText);
      book.authors.forEach( author => {
        search = search || author.first.toLowerCase().includes(searchText)
        || author.last.toLowerCase().includes(searchText);
      });
      book.genres.forEach( genre => {
        search = search || genre.genre.toLowerCase().includes(searchText);
      });
      return search;
    });
  }

}
