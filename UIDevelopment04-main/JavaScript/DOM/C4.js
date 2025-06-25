var v1 = document.getElementsByClassName("list1")
console.log(v1)

v1[0].textContent = "Apple"
v1[1].textContent = "Samsung"
v1[2].textContent= "Vivo"
v1[3].textContent = "MI"

console.log(v1[0])
console.log(v1[1])
console.log(v1[2])
console.log(v1[3])

v1[1].style.backgroundColor = "lightgreen"

v1[2].style.fontSize = "25px"

for(i = 0; i < v1.length; i++){
    console.log(v1[i].style.fontFamily ="arial")
}
