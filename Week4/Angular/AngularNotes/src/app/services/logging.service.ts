
import {Injectable} from '@angular/core';

@Injectable()// can have dependecies injected into this class; should be on top of every service you create
export class LoggingService {

    info(message: string): void {

        console.log(`INFO: ` + message);

    }

    warn(message: string): void {

        console.log(`WARN: ` + message);

    }

}
