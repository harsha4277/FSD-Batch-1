//Rest Operator
//Normal function with arguments keyword 
function f1(){
    console.log(arguments)
}
f1(10,20)
f1(10,20,30,40,50)

//Using for loop with arguments keyword
function f2(){
    for (let i in arguments){
        console.log(i, arguments[i])
    }
}
f2(10,20)
f2(10,20,30,40,50)

//Rest Operator
function f3(...args){
    console.log(...args)
}
f3(10,20)
f3(10,20,30,40,50)