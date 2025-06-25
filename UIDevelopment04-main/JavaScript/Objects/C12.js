//Nested Object 
let user = {
    firstName : "Sai",
    lastName : "Kiran",
    address : {
        pincode : 500001,
        city : "Hyd"
    }
}
console.log(user.address) // { pincode: 500001, city: 'Hyd' }
console.log(user.address.city) //Hyd
console.log(user.address.pincode) // 500001
