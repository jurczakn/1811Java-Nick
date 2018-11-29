import {Person} from './classes';

let numArray: Array<number>;

numArray = [3, 4, 6, 2, 3, 4, 5];

//numArray = [`hi`, `bye`];

function identity<T>(arg: T): T{
    return arg;
}

console.log(identity(`hi`));

interface GenericInterface<T> {

    stuff: T;

}

class GenericClass<T> {

    stuff: T;
    stuff2: T;

    add: (x:T, y: T) => T;

}

let myObj: GenericClass<Person> = {
    stuff: new Person(4, `moto`, true), 
    stuff2: new Person(4, `moto`, true), 
    add(x, y){return x;}
}