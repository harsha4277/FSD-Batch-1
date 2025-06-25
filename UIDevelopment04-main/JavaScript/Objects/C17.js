//Single Level Inheritance using parameter constructor
class Parent{

    constructor(firstName, lastName){
        console.log(firstName)
        console.log(lastName)
    }
}

class Child extends Parent{

    constructor(email, address){
        super("Sai", "Kiran")
        console.log(email)
        console.log(address)
    }
}

new Child("sk@gmail.com", "Hyd")