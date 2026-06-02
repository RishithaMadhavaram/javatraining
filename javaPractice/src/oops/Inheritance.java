package oops;

class Animal {
		void sound() {
			System.out.println("Animal sounds");		
		}
	}
	class Dog extends Animal{
		void bark() {
			System.out.println("Bow Bow");
		}
	}
	public class Inheritance{
		public static void main(String args[]) {
			Dog d = new Dog();
			d.bark();
			d.sound();		
		}
	}

