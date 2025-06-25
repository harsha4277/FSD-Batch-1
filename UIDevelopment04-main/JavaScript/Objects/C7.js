//call apply bind 
let l1 = {
    firstName : "Sai",
    lastName : "Kiran",
    display : function(age, contact){
        console.log(this)
        console.log(this.firstName + " " + this.lastName)
        console.log(age, contact)
    }
}

l1.display()
l1.display.call(l1, 25, 9876543210)

l1.display.apply(l1, [28, 9876543210])


let l3 = l1.display.bind(l1, 30, 9876543210)
l3()
