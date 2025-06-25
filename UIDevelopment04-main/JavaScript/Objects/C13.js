//destrutring arrays 
let l1 = [10,20,30,40,50]
console.log(l1) // [ 10, 20, 30, 40, 50 ]
console.log(l1[0], l1[1], l1[2], l1[3], l1[4]) // 10 20 30 40 50

// destrutring arrays 
// let [one, two, three, four, five] = l1
// console.log(one, two, three, four, five) //10 20 30 40 50

//default value is ignored in case of existing object
// let [one, two, three, four=400, five] = l1
// console.log(one, two, three, four, five) //10 20 30 40 50

//adding new object to array
let [one, two, three, four, five, six=600] = l1
console.log(one, two, three, four, five, six) // 10 20 30 40 50 600