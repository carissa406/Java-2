package Labs;

import java.util.Scanner;

public class Lab01_3 {
	Scanner input = new Scanner(System.in);
	Student[] students = new Student[10];
	public static void main(String[] args) {
		new Lab01_3();
	}
	
	public Lab01_3() {
		while (true) {
			System.out.println("Type 1 to add, 2 to remove, 3 to display, 4 to exit");
			String choice = input.nextLine().trim();
			
			switch (choice) {
			case "1":
				add();
				break;
			case "2":
				remove();
				break;
			case "3":
				display();
				break;
			default:
				System.exit(0);
			}
			
		}
		
	}
	
	private void add() {
		System.out.println("Enter First Name");
		String strFirstName = input.nextLine();
		
		System.out.println("Enter Last Name");
		String strLastName = input.nextLine();
		
		System.out.println("Enter Major");
		String strMajor = input.nextLine();
		
		Student myStudent = new Student(strFirstName, strLastName, strMajor);
		
		boolean isInserted = false;
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = myStudent;
				isInserted = true;
				System.out.println("Student added");
				break;
			}
			
		}
		
		if(!isInserted) {
			System.out.println("Your list is full. You cannot add another student.");
		}
	}
	
	private void remove() {
		System.out.println("Enter the first name of the student to remove: ");
		String strFirstNameToRemove = input.nextLine();
		
		System.out.println("Enter the last name of the student to remove: ");
		String strLastStringToRemove = input.nextLine();
		
		boolean isRemoved = false;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null
					&& students[i].getStrFirstName().equals(strFirstNameToRemove)
					&& students[i].getStrLastName().equals(strLastStringToRemove)) {
				
				students[i] = null;
				isRemoved = true;
				System.out.println("Student was removed");
				break;
				
			}
		}
		
		if(!isRemoved) {
			System.out.println("Student could not be found, and was not removed");
		}
		
	}
	
	private void display() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println(students[i].getStrFirstName() + " " + students[i].getStrLastName() + " " + students[i].getStrMajor());
			}
			
		}
		
	}

}
