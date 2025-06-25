//call
let l1 = {
    firstName : "Sai",
    lastName : "Kiran"
}

//writing the function outside 
let f = function(){
    console.log(this.firstName  + " " + this.lastName)
}

f.call(l1)

let l2 = {
    firstName : "Sai",
    lastName : "Ram"
}

f.call(l2)