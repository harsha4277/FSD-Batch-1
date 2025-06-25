//Polymorphsim : Having ManyForms 
class Parent{

    constructor(firstName, lastName){
        this.fName = firstName
        this.lName = lastName
    }

    getDetails(){
        console.log("Parent: " + this.fName, this.lName)
    }
}

class Child extends Parent{

    //Method overriding
    getDetails(){
        super.getDetails()
        console.log("Child: " + this.fName, this.lName)
    }

}

new Child("Sai", "Kiran").getDetails()