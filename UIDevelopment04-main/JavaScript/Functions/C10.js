//Arrow functions 
//Normal function
function f1(name){
    console.log("User Name is ", name)
}
f1("Admin")

//Assign function to a variable
let f2 = function(name){
    console.log("User Name is ", name)
}
f2("System")

//Arrow functions
let f3 = (name) => {console.log("User Name is ", name)}
f3("Root")
