// TypScripts typing allows us to define types of our variables
var myString;
myString = "this is a string";
//trying to assign a number to a string - myString, causes Error
myString = 4;
//TypeScript can also infer types
var anotherString = "this is a string without :string";
//anotherString = 22;
var yetAnotherString; //not good, do not do
yetAnotherString = "this string";
yetAnotherString = 4;
//Other basic types
var aString;
var aNumber;
var aBoolean;
var anArray;
var anything;
//avoid using any, bad practice
var nothing;
var no;
console.log(!!nothing);
