//call
let l = {
    firstName : "Sai",
    lastName : "Kiran",
    display : function(){
        console.log(this)
        console.log(this.firstName + " " + this.lastName)
        console.log("-----------------------------------")
    }
}

l.display()

//  function borrowing
let l2 = {
    firstName : "Sai",
    lastName : "Kumar"
}

l.display.call(l2)

let l3 = {
    firstName : "Sai",
    lastName : "Ram"
}

l.display.call(l3)

console.log(l)