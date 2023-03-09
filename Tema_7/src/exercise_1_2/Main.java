package exercise_1_2;

import java.util.Scanner;

import consoleInput.ConsoleInput;

public class Main {

	public static void main(String[] args) {
		new Main().show();
	}

	public void show() {

		Scanner keyboard = new Scanner(System.in);
		ConsoleInput consoleInput = new ConsoleInput(keyboard);

		boolean choice;

		Person person;

		Person teacher = new Teacher();
		Student student = new Student();

		System.out.printf("Input T for Teacher and S for Student");

		choice = consoleInput.readBooleanUsingChar('T');

		if (choice) {
			person = teacher;
		} else {
			person = student;
		}

	}

}
