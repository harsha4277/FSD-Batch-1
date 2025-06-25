//Arrow functions using args with template strings
//Normal function
function f1(name){
    console.log(`User Name is ${name}`)
}
f1("Admin")

//Assign function to a variable
let f2 = function(name){
    console.log(`User Name is ${name}`)
}
f2("System")

//Arrow functions
let f3 = (name) =>  console.log(`User Name is ${name}`)
f3("Root")

//Better for singe args 
let f4 = (name) =>  `User Name is ${name}`
console.log(f4("1234"))

//Multiple arguments
let f5 = (id, name) => {console.log(`User Id is ${id} and Name is ${name}`)}
f5(101, "Sai Kiran")
