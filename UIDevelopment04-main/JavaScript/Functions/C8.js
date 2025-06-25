//pure functions
function f1(n){
    square = n*n
    return square
}

console.log(f1(5))

//pure function 
function f2(userName, password){
    if(userName == "Admin" && password == "Admin"){
        console.log("Login success")
    }else{
        console.log("Login failed")
    }
}
f2("Admin", "Admin")

//impure function
function f3(userName, password){
    userName = "System"
    if(userName == "Admin" && password == "Admin"){
        console.log("Login success")
    }else{
        console.log("Login failed")
    }
}
f3("Admin", "Admin")

//impure function
let a = [10,20,30]
function f4(element){
    a.push(element)
    console.log(a)
}

f4(40)
f4(50)