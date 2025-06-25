//object literals adding the properties and updating the properties and delete the properties
let firstName = "Sai"
let lastName = "KIran"

let user = {
    firstName : firstName,
    lastName : lastName
}
console.log(user) // { firstName: 'Sai', lastName: 'KIran' }

//add the properties
user.contact = 9876543210
console.log(user.contact) // 9876543210
console.log(user) // { firstName: 'Sai', lastName: 'KIran', contact: 9876543210 }

//update the properties
user.firstName = "Rahul"
console.log(user.firstName) // Rahul
console.log(user) // { firstName: 'Rahul', lastName: 'KIran', contact: 9876543210 }

//delete the properties
delete user.lastName 
console.log(user) // { firstName: 'Rahul', contact: 9876543210 }