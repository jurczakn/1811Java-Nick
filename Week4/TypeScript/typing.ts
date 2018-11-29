// TypScripts typing allows us to define types of our variables
let myString: string;

myString = `this is a string`;

//trying to assign a number to a string - myString, causes Error
myString = 4;

//TypeScript can also infer types
let anotherString = `this is a string without :string`;

//anotherString = 22;

let yetAnotherString;  //not good, do not do

yetAnotherString = `this string`;

yetAnotherString = 4;

//Other basic types

let aString: string;

let aNumber: number;

let aBoolean: boolean;

let anArray: Array<string>;

let anything: any;
//avoid using any, bad practice

let nothing: void;

let no: never;

console.log(!!nothing);

