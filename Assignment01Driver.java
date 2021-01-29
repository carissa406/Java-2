package Assignments;


import java.util.Iterator;
import java.util.Scanner;

public class Assignment01Driver {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Assignment01Driver();
	}

	// This will act as our program switchboard
	public Assignment01Driver() {
		String[] cargohold = new String[10];
		System.out.println("Welcome to the Revenge Cargo Hold interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");
		while (true) {
			// Give the user a list of their options
			System.out.println("1: Add an item to the cargo hold.");
			System.out.println("2: Remove an item from the cargo hold.");
			System.out.println("3: Sort the contents of the cargo hold.");
			System.out.println("4: Search for an item.");
			System.out.println("5: Display the items in the cargo hold.");
			System.out.println("0: Exit the Revenge Cargo Hold interface.");
			// Get the user input
			int userChoice = input.nextInt();
			input.nextLine();
			switch (userChoice) {
			case 1:
				addItem(cargohold);
				break;
			case 2:
				removeItem(cargohold);
				break;
			case 3:
				sortItems(cargohold);
				break;
			case 4:
				searchItems(cargohold);
				break;
			case 5:
				displayItems(cargohold);
				break;
			case 0:
				System.out.println("Thank you for using the Scopuli Cargo Hold interface. See you again soon!");
				System.exit(0);
			}
		}
	}

	private void addItem(String cargohold[]) {
		// TODO: Add an item that is specified by the user
		System.out.println("Please type the name of the item to add: ");
		String item = input.nextLine().trim().toLowerCase();
		
		for (int i = 0; i < cargohold.length; i ++) {
			if(cargohold[i] == null) {
				cargohold[i] = item;
				System.out.println(item + " has been added");
				return;
			}
		}
		
		System.out.println("Your cargohold is too full! " + item + " was not added.");
	}

	private void removeItem(String cargohold[]) {
		// TODO: Remove an item that is specified by the user
		System.out.println("Please type the name of item to remove: ");
		String itemToRemove = input.nextLine().trim().toLowerCase();
		
		boolean isRemoved = false;
		for (int i = 0; i < cargohold.length; i++) {
			if (cargohold[i] != null && cargohold[i].equals(itemToRemove)) {
				cargohold[i] = null;
				isRemoved = true;
				System.out.println(itemToRemove + " was removed");
				break;
			}
			
		}
		 if(!isRemoved) {
			 System.out.println(itemToRemove + " was not found and could not be removed.");
		 }
	}

	private void sortItems(String cargohold[]) {
		// TODO: Sort the items in the cargo hold (No need to display them here) - Use
		// Selection or Insertion sorts

		// NOTE: Special care is needed when dealing with strings! research the
		// compareTo() method with strings
		
		for (int i = 0; i < cargohold.length; i++) {
			if (cargohold[i] == null) {
				cargohold[i] = "";
			}
		}
		//https://www.geeksforgeeks.org/program-to-sort-an-array-of-strings-using-selection-sort/
		for (int i = 0; i < cargohold.length; i++) {
			int min_index = i;
			String minStr = cargohold[i];
			for(int j = i + 1; j < cargohold.length; j++) {
				if(cargohold[j].compareTo(minStr) < 0) {
					minStr = cargohold[j];
					min_index = j;
				}
			}
		if(min_index != i) {
			String temp = cargohold[min_index];
			cargohold[min_index] = cargohold[i];
			cargohold[i] = temp;
		}
		}
		
		for (int i = 0; i < cargohold.length; i++) {
			if (cargohold[i] == "") {
				cargohold[i] = null;
			}
		}
		System.out.println("The cargo has been sorted.");
	}
			
	private void searchItems(String cargohold[]) {
		// TODO: Search for a user specified item
		System.out.println("What item do you want to search for?: ");
		String itemToSearch = input.nextLine().trim().toLowerCase();
		int units = 0;
		for (int i = 0; i < cargohold.length; i++) {
			if(cargohold[i] != null && cargohold[i].equals(itemToSearch)) {
				units++;
			}
		}
		String s=String.valueOf(units);
		System.out.println("There is " + s + " of that item.");
	}

	private void displayItems(String cargohold[]) {
		// TODO: Display only the unique items along with a count of any duplicates
		//
		// For example it should say
		// Food - 2
		// Water - 3
		// Ammunition - 5
		
		String[] unique = new String[10];
		for (int i = 0; i < cargohold.length; i++) {
			boolean contains = false;
			for (int j = 0; j < unique.length; j++) {
				if (unique[j] != null && cargohold[i] != null && unique[j].compareTo(cargohold[i]) == 0) {
					contains = true;
				}
			}
			if (contains == false) {
				for (int j = 0; j < unique.length; j ++) {
					if(unique[j] == null) {
						unique[j] = cargohold[i];
						break;
					}
				}
			}
		}
		
		int[] count = new int[unique.length];
		for (int i = 0; i < unique.length; i++) {
			for (int j = 0; j < cargohold.length; j++) {
				if (unique[i] != null && cargohold[j] != null && unique[i].compareTo(cargohold[j]) == 0) {
					count[i] ++;
				}	
			}	
		}
		
		for (int i = 0; i < unique.length; i++) {
			if (unique[i] != null) {
				System.out.println(unique[i] + " - " + count[i]);
			}
		}
		
		
	}
	

}