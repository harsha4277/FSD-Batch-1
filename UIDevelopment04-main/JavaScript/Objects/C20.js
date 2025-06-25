//Abstraction
class Parent{

    firstName
    lastName

    constructor(firstName, lastName){
        if(this.constructor == Parent){
            throw new Error("Abstract class cant be instantiated")
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    getDetails(){
        console.log("Parent Class: " + this.firstName, this.lastName);
    }
}

class Child extends Parent{

    constructor(firstName, lastName){
        super(firstName, lastName)
    }

    getDetails(){
        console.log("Child Class: " + this.firstName, this.lastName);
    }
}

// let p = new Parent("Sai", "Kiran")
// console.log(p) // Parent { firstName: 'Sai', lastName: 'Kiran' }
// p.getDetails() // Parent Class: Sai Kiran

let c = new Child("Sai", "Kiran")
console.log(c) //Child { firstName: 'Sai', lastName: 'Kiran' }
c.getDetails() // Child Class: Sai Kiran
