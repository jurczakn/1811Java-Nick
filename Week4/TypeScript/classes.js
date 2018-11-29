//classes are templates for objects
//in Angular we use classes for components, services, directives, pipes, and many others
var Person = /** @class */ (function () {
    function Person(numberOfLegs, motorcycle, hasTacos) {
        this.numberOfLegs = numberOfLegs;
        this.motorcycle = motorcycle;
        this.hasTacos = hasTacos;
    }
    Person.prototype.moveLegs = function () {
        console.log("legs are moving, all " + this.numberOfLegs + " of them");
    };
    Person.prototype.getSecrete = function () {
        return this.secrete;
    };
    Person.prototype.setSecrete = function (secrete) {
        this.secrete = secrete;
    };
    Person.isPerson = function () {
        return true;
    };
    return Person;
}());
//Instantiate object of Person class
var person = new Person(7, "yamaha", false);
//person.secrete;
person.moveLegs();
console.log(Person.isPerson());
