public class Puppy { // Only one public class can be declared per file
	int puppyAge;

	public Puppy(String name){ // Contructor with one parameter, name
		System.out.println("Passed Name is :" + name);
	}

	public void setAge(int age){
		puppyAge = age;
	}

	public int getAge(){
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args){
		Puppy myPuppy = new Puppy("Tommy"); // Declaration, Instantiation, and Initialization
		myPuppy.setAge(2);
		myPuppy.getAge();

		System.out.println("Variable Value :" + myPuppy.puppyAge);
	}
}
