import { InvoiceLine } from './invoice-line';
import { Customer } from './customer';

export class Purchase {
    id: number;
    cust: Customer;
    total: number;
    status: string;
    invoiceLines: InvoiceLine[];
}
