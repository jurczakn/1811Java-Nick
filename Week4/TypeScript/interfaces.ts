//Interfaces are contracts for other classes and objects
//Can be used to define custom types without creating classes
//Interfaces ARE NOT transpiled to JavaScript.  Only used by Type Checker
interface User{
    username: string;
    password: string;
    profession?: string;  //allows us to have optional field
}

let user: User;

user = {username: `bob`, password: `bobbert`}; //valid instantiation of user

user = {username: `jeff`, password: `chaos`, profession: `scientist`};

//user = {username: `stuff`, masterPassword: `haha`}; invalid instaniation of user