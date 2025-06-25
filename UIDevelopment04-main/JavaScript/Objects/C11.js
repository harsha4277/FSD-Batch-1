//iterables 
let user = {
    firstName : "Sai",
    lastName : "Kiran"
}

console.log("firstName" in user) // true
console.log("contact" in user) // false

//iterables
for(i in user){
    console.log(i, user[i])
}