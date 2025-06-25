//Accessing properties from an object . []
let l = {
    firstName : "Sai", 
    lastName : "Kiran",
    email : "sai@gmail.com",
    company : function(){console.log("Wipro")}
}
console.log(l.firstName)
console.log(l["lastName"])

l.contact = 987654321
console.log(l["contact"])

l["address"] = "Hyd"
console.log(l.address)

console.log(l)