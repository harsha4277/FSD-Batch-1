// Assignment Operators += -= *= /= %= 
var a = 10
var b = 20
console.log(a+=b) // a = a+b // a = 10+20 // 30
console.log("In Memory " + a)
console.log(a-=b) // a = a-b // a = 30-20 // 10
console.log("In Memory " + a)
console.log(a*=b) // a = a*b // a = 10*20 // 200
console.log("In Memory " + a)

var c = 15
var d = 3 
console.log(c/=d) //c = c/d // 5
console.log(c%=d) // c = c%d // 2