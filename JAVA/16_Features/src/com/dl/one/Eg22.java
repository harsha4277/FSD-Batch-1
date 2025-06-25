package com.dl.one;

@FunctionalInterface
interface StudentIn{
	
	Student id(int id, String name);
}

class Student{
	
	public Student(int id, String name) {
		System.out.println(id + " " + name);
	}
}
public class Eg22 {

	public static void main(String[] args) {
		
		StudentIn ref = Student::new;
		ref.id(101, "Hari");
		ref.id(102, "Mahi");
		ref.id(103, "Bunny");
		ref.id(104, "Sunny");

	}

}
