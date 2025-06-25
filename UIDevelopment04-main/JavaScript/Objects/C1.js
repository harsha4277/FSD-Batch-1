//objects
let l = {
    firstName : "Sai",
    lastName : "Kiran",
    company : function() {console.log("Wipro")}
}
console.log(l) // { firstName: 'Sai', lastName: 'Kiran', company: [Function: company] }
console.log(l.firstName)
console.log(l.lastName)
console.log(l.company)
l.company() // Wipro
