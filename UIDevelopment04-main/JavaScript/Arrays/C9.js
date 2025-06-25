let l1 = [10,20,30,40,50,60,70,80,90]
//         0  1  2  3  4 5   6  7  8
//        -9 -8 -7 -6 -5 -4 -3 -2 -1
//splice(start, deleteCount) : remove one of element
console.log(l1)
console.log(l1.splice(2,1)) // [ 30 ]
console.log(l1) // [10, 20, 40, 50,60, 70, 80, 90]

//splice(start, deleteCount) : adding new element in bw
let l2 = [10,20,30,40,50,60,70,80,90]
//         0  1  2  3  4 5   6  7  8
//        -9 -8 -7 -6 -5 -4 -3 -2 -1
console.log(l2.length) // 9
console.log(l2.splice(2,0,300)) // []
console.log(l2) // [10, 20, 300, 30, 40,50, 60,  70, 80, 90]
console.log(l2.length)  // 9