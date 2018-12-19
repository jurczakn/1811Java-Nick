import { User } from './user';
import { Address } from './address';
import { Book } from './book';

export class Customer extends User {
    address: Address;
    readingList: Book[];
}
