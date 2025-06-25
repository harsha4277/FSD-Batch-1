//passing default values in function
function f1(a=10, b=20){
    console.log(a,b)
}

f1()
f1(100,200)
f1(1000)

//passing key and value in function
function f2(x, y){
    console.log(x,y)
}

f2(10,20)
f2(x=120, y=220)
