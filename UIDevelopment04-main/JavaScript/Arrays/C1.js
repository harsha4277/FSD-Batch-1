//Arrays
let names = ["NameOne", "NameTwo", "NameThree", "NameFour", "NameFive"]
//                 0         1          2            3            4
console.log(names) // [ 'NameOne', 'NameTwo', 'NameThree', 'NameFour', 'NameFive' ]

//Index Call
console.log(names[0]) // NameOne
console.log(names[1]) // NameTwo
console.log(names[2]) // NameThree
console.log(names[3]) // NameFour
console.log(names[4]) // NameFive
console.log(names[5]) // undefined

//length of array
console.log(names.length) // 5

//Itterate the array 
for(let i = 0; i < names.length; i++){
    console.log(names[i])
}

// NameOne
// NameTwo
// NameThree
// NameFour
// NameFive