//Single Level Inheritance
class Parent{

    a = 10
    b = 20

    constructor(){
        console.log(this.a)
        console.log(this.b)
    }
}

class Child extends Parent{

    c = 30
    d = 40
    constructor(){
        super()
        console.log(this.c)
        console.log(this.d)
    }
}

new Child()