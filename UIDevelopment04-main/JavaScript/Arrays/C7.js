//splice // remove elements
let l1 = [10,20,30,40,50,60,70,80,90]
//         0  1  2  3  4 5   6  7  8
//        -9 -8 -7 -6 -5 -4 -3 -2 -1
console.log(l1) //MacBook-Pro:Arrays admin$ node C7.js[ 10, 20, 30, 40, 50,60, 70, 80, 90]
console.log(l1.splice(2)) // [30, 40, 50, 60,70, 80, 90]
console.log(l1) // [ 10, 20 ]

//[ 10, 20 ]
console.log(l1.splice(1)) // [ 20 ]
console.log(l1) // [ 10 ]

// [ 10 ]
console.log(l1.splice(0)) // [ 10 ]
console.log(l1) // []