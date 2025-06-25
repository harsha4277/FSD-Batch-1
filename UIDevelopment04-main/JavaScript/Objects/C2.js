//this
let l = {
    firstName : "Sai",
    lastName : "Kiran",
    company : function () {
        console.log(this)
        console.log(this.firstName)
        console.log(this.lastName)
        console.log("Wipro")
    }

}
l.company()

console.log(this)
this.a = 10
this.b = 20
console.log(this)