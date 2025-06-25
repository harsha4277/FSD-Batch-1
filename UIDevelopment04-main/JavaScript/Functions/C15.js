//Higher order functions
//A function that takes as argument or returns a function
let f1 = function(){
    return function(){
        console.log("f1 function")
    }
}
console.log(f1) // [Function: f1]

let f2 = f1()
console.log(f2) // [Function (anonymous)]
f2() // f1 function

