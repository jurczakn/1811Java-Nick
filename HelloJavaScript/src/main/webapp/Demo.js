/**
 * 
 */

//comment 
//JavaScript - cross-platform, object-oriented scripting
//language used to make webpages interactive.

//There are many more advanced server side versions of JS
//such as Node.JS which allow you to add more functionality
//to a website.

//primitive data types
//number
//string
//boolean
//null
//undefined 
//symbol - ECMAScript 6, is a unique and immutable primitive
//value, it may be used as the key of an Object

//reference types
//object
//arrays
//functions

//var num = 5;		//can declare global and local variables
//let num2 = 3;		//can declare all scopes
//const num3 = 4;		//cannot change

//scopes
//local
//block
//global

//generally, you want to stay away from global variables
//because you don't want them changing value or type.

let name='Tim';	//string, doesn't care about single or double quotes
let numberOne = 5;
let isApproved = false;
let whyVariable = undefined;
let noObj = null;

//console.log(name);


//let numOne;	//undefined variables - those that are declared
			//but have not been given any value
//if you try to reference an undefined variable,
//JS will return "undefined"

///undeclared variables - are those that do not exist
		//in a program and are not declared.
//if you try to reference an undeclared variable.
//runtime error is encountered


// == just value, === type AND value (strictly equals)
// 5=="5" is true, 5==="5" is false



let exObj = {};	//object

let superHero = {
		name : 'TiMannh',
		ability : 'Changing number of legs',
		'Tim' : "wait, Tim is a thing?"
};

superHero.secretidentity = "Timothy... again";
//console.log(superHero.secretidentity);
//console.log(superHero.name);
//console.log(superHero.Tim);
//
//delete superHero.Tim; //you can also dynamically delete fields in objects

//JavaScript is dynamic because you can switch data types
//immediately (loose typing), at runtime you can add/delete
//new fields into your object

var num1 = 10;
var num2 = num1;
num1 = 25;
//console.log(num1);
//console.log(num2);
//our variables pass by value, so num1=25 and num2=10. 

var num3= {
		value : 10
};
var num4 = num3.value;
num3.value = 50;
//console.log(num3);
//console.log(num4);
//object are still passed by value, using specifically their address
	

var arrayOfDoggos=['doggo', 'pupper', 'bowwow', 'goodestboi'];
//console.log(arrayOfDoggos);
//console.log(arrayOfDoggos[2]);

arrayOfDoggos[4]='woofer';
arrayOfDoggos[0]=0;
console.log(arrayOfDoggos);


//ECMAScript 6: (ES6)
//let, const
//symbol
//template literals (backticks) ``

var tempNum = 15;

//var longString='Print longString: ' + tempNum +
//' and now that we have that... theres more';

/*var longString = `Printing longString: ${tempNum}

and now that we have that, there's more.
Let's add more, even. and more and you get the point.

0_0
:3
-_-
o_o

more.
and..... more.`;

console.log(longString);
*/

//functions
//printStuff();		//hoisting - moving all declarations
					//to the top of the scope

//function printStuff() {
//	console.log("stuff");
//}

//console.log(printStuff);
//printStuff();


function falseDemo(someName) {
	if (someName)
		console.log("falseDemo argument happens to be true this time")
}

//var someVar = -5;
//falseDemo(someVar);

//Falsey Values/Truthy Values

//numbers are inherently true, 0 is false
//string are inherently true, empty string is false
//false is false, true is true
//null is false
//undefined is false
//NaN (isNan) is false

let x = 10;
let y = 30;
function mult() {
	return x*y
}

//console.log(mult());
//you can declare variables on the same line with a comma,
//best practice to declare them on different lines.
	

//Anonymous functions
//An anonymous function is a function without a name.

let anoFunc = function() {
	console.log("in anoFunc")
}

anoFunc(); 	//return "in anoFunc"

//Self invoking functions
//A function that can call itself
(function() {
	let someVariable = "inside self invoking function";
	console.log(someVariable);
})();





