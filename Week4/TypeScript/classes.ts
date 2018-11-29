//classes are templates for objects
//in Angular we use classes for components, services, directives, pipes, and many others


export class Person{

    //fields
    numberOfLegs: number;
    motorcycle: string;
    hasTacos: boolean;

    private secrete: string;

    protected children: number;

    constructor(numberOfLegs: number, motorcycle: string, hasTacos: boolean){
        this.numberOfLegs = numberOfLegs;
        this.motorcycle = motorcycle;
        this.hasTacos = hasTacos;
    }

    public moveLegs(): void{
        console.log(`legs are moving, all ` + this.numberOfLegs + ` of them`);
    }

    public getSecrete(): string{
        return this.secrete;
    }

    public setSecrete(secrete: string): void{
        this.secrete = secrete;
    } 

    static isPerson(): boolean{
        return true;
    }

}

//Instantiate object of Person class
let person = new Person(7, `yamaha`, false);
//person.secrete;
person.moveLegs();
console.log(Person.isPerson());
