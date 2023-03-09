package exercise_1_2;

public class Person {

	private String name;
	private int age;
	private String gender;
	private String nationality;

	Person() {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.nationality = nationality;
	}
	
	Person(String name, int age, String gender, String nationality) {
		name = "Paco";
		age = 32;
		gender = "Masculino";
		nationality = "Español";
	}

	@Override
	public String toString() {
		return String.format("Name: %s, Age: %d, Sex: %s, Nationality: %s", name, age, gender, nationality);
	}

}
