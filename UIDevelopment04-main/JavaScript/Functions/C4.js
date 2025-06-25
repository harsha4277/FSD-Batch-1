//Types of Variables
//Global 

var a = 10
function f1(){
    console.log(a)
}
console.log(a)

f1()

console.log(a)

//Local
function f2(){
    var a = 100
    var b = 200
    console.log(a, b)
}
// console.log(a, b) // ReferenceError: a is not defined

f2()