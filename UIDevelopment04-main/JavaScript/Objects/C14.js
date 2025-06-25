//destruring objects
let user = {
    firstName : "Sai",
    lastName : "Kiran",
    useContact : 98765443210,
    userAddress : "Hyd",
    userPincode : 500001
}

//destruring objects
// let d1 = {firstName : fn, lastName : ln, useContact :uc} = user
// console.log(fn, ln, uc) // Sai Kiran 98765443210

//default value is ignored in case of existing object
// let d1 = {firstName : fn, lastName = "Sam", useContact :uc} = user
// console.log(fn, lastName, uc) // Sai Kiran 98765443210

//adding new object
// let d1 = {firstName : fn, lastName: ln, useContact :uc, userAddress = "Hyd"} = user
// console.log(fn, ln, uc, userAddress) // Sai Kiran 98765443210 Hyd

//rest operator
let d1 = {...args} = user
console.log(d1)


