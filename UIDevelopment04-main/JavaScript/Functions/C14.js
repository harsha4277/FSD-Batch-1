//rest operator and spread operator
//object 
let user = {
    name : "Sai Kiran",
    age  : 26,
    contact : [9876543210, 9876541230]
}
console.log(user) // { name: 'Sai Kiran', age: 26, contact: [ 9876543210, 9876541230 ] }

//rest operator using object 
let {name, age, ...r} = user
console.log(user.name)  //Sai Kiran
console.log(user.age)  //26
console.log(r) // { contact: [ 9876543210, 9876541230 ] }

//spread operator using object
let newUser = {
    ...user
}
console.log(newUser) // { name: 'Sai Kiran', age: 26, contact: [ 9876543210, 9876541230 ] }

//js 
//... (rest, spread)
