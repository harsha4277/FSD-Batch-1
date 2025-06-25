// slice // gettting block of elements
let l1 = [10,20,30,40,50,60,70,80,90]
//         0  1  2  3  4 5   6  7  8
//        -9 -8 -7 -6 -5 -4 -3 -2 -1
console.log(l1) // [ 10, 20, 30, 40, 50 ]

//slice(start)
console.log(l1.slice(2)) // [ 30, 40, 50 ]

//slice(start, end)
console.log(l1.slice(3, 7)) // [ 40, 50, 60, 70 ]

//slice(start, end)
console.log(l1.slice(-1)) //[ 90 ]
console.log(l1.slice(-4)) // [ 60, 70, 80, 90 ]
console.log(l1.slice(-4, -2)) // [ 60, 70 ]
console.log(l1.slice(-2, -4)) // []