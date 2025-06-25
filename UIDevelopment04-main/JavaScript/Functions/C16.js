//Callback function
//The function that is passed as argument to another function and invoked in another function
function f1(firstName, lastName){
    console.log(`My First Name: ${firstName} and My Last Name: ${lastName}`)
}

function f2(firstName, lastName){
    fName = " is " + firstName
    lName = " is " + lastName
    f1(fName, lName)
}
f2("Sai", "Kiran")
f2("Sai", "Kumar")