//constructor with arguments using this keyword and prototype method using this keyword
class Parent{

    constructor(firstName, lastName){
        this.fName = firstName
        this.lName = lastName
    }

    //prototype method
    getDetails(){
        console.log(this.fName, this.lName)
    }
}

let p = new Parent("Sai", "Kiran")
p.getDetails()