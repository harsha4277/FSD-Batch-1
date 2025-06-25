//Spread Operator and Rest Operator
//Normal function
function f1(x,y,z){
    return x+y+z 
}
console.log(f1(10,20,30)) // 60 

//Rest Operator using function
function f2(x,y,z, ...args){
    return x+y+z+ " ,"+ args
}
console.log(f2(10,20,30)) //60 ,
console.log(f2(10,20,30, 40, 50)) // 60 ,40,50

//Spread Operator using array
let a = ["NameOne", "NameTwo", "NameThree", "NameFour"]
function getNames(n1, n2, n3, n4) {
    console.log(n1 + " " + n2 + " " + n3 + " " + n4)
}
getNames(a[0], a[1], a[2], a[3])
getNames(...a)

