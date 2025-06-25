//Bitwise Operators & | ^ ~
//if both condition satisfy then the result is true
console.log(true & true) // 1
console.log(false & true) // 0
console.log(true & false) // 0
console.log(false & false) // 0

//In both conditions any one of the condition must satisfy
console.log(true | true) // 1
console.log(false | true) // 1
console.log(true | false) // 1
console.log(false | false) // 0

//if both are same the the result will be false
console.log(true ^ true) // 0
console.log(false ^ true) // 1
console.log(true ^ false) // 1
console.log(false ^  false) // 0

//opposite binary value 
console.log(~true) // 0000000000000001 // 1111111111111110
console.log(~false) // 0000000000000000 // 1111111111111111

