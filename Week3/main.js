/* function myFunc(x, y, z){
    return x + y + z;
}

function myFunc(x, y){
    return x + y;
} */

let myFunc = function (x, y, z) {
    return x + y + z;
}

myFunc = function (x, y) {
    console.log('X: ' + x);
    console.log('Y: ' + y);
    return x + y;
}

myFunc = function () {
    let ret = 0;
    for (i in arguments) {
        ret += arguments[i];
    }
    return ret;
}

let squigglyLines = {
    key: 'value',
    myMethod: function () { console.log('hi'); },
    age: 55
};

//Clousure: a way to achieve Encapsulation in JS
//by returning a function from within a function
let x = function () {

    let value;

    return {

        getX: function () {
            return value;
        },

        setX: function (x) {
            value = x;
        }

    }

}();


var tax;

//Immediately Evoked Function Expression
//allowed JS developers to create a local scope
//Pre-ES6
(function iefe() {
    var price = .99;
    var stTax = .06;
    var cntTax = .01;
    tax = (price * stTax) + (price * cntTax);
})();
console.log(tax);

//Maker function
function makeCat(numberOfLegs, color, id, breed) {
    let cat = {};
    cat.numberOfLegs = numberOfLegs;
    cat.color = color;
    cat.id = id;
    cat.breed = breed;
    return cat;
}

var Cat = function(){};
Cat.prototype.meow = function(){console.log('I am a cat and I am meowing');};
Cat.prototype.scratch = function(){console.log('ow, that hurt');};

var BrendleCat = function(){};
BrendleCat.prototype = new Cat();
BrendleCat.prototype.getType = function(){return "BrendleCat";};

//as of ES6, JavaScript has introduced class syntax
//all of this is simply syntax sugar

class Dog{

    constructor(name, age, breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    bark() {
        console.log("I am a dog and I am barking");
    }

    run(){
        console.log("I am a dog and I am running");
    }

}

class Puppy extends Dog{
    constructor(name, breed){
        super(name, 0, breed);
        this.cuteness = 'great';
    }
}