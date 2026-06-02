package oops;

class Parent{
		void parentMethod() {
			System.out.println("This is a pa method");
		}
		void trial() {
			System.out.println("Trying to print");
		}

	}
	class Child extends Parent{
		@Override
		void parentMethod() {
			System.out.println("this is a method");
		}
		void trial() {
			System.out.println("Trying to print override method");
		}
	public class PolymorphismOverride {
		public static void main(String args[]) {
				Child ch = new Child();
				ch.parentMethod();
				ch.trial();
//				Parent p = new Parent();
//				p.parentMethod();

	}
	}
}
