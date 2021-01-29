package Labs;

import java.util.Random;

public class Lab01_1 {

	private int timesToRun = 5;
	public static void main(String[] args) {
		new Lab01_1();
		//test();
	}

	// This method will test all of the functionality and attributes of your player class.
	// These are the tests that you must pass to complete the lab.
	private static void test() {
		Player p1 = new Player("Player One", 100, 5.0);
		System.out.println(p1.getName());
		System.out.println(p1.addHealth(10));
		System.out.println(p1.deductHealth(10));
		System.out.println(p1.withdrawalCoins(10.0));
		p1.depositCoins(10.0);
		System.out.println(p1.withdrawalCoins(10.0));
		p1.setName("Player One - Edited");
		System.out.println(p1.getName());
	}

	public Lab01_1() {
		
		System.out.println("Generating Two Players");
		
		for (int i = 0; i < timesToRun; i++) {
			Player p1 = new Player("Instructor Smith", 100, 50.3);
			Player p2 = new Player("Student 1", 100, 25.7);
			Random r = new Random();
			while (true) {
				int chance = r.nextInt(100);
				if (chance < 25) {
					if (p2.withdrawalCoins(5.0)) {
						p1.depositCoins(5.0);
					} else {
						System.out.println(p2.getName() + " is broke, and loses the game.");
						break;
					}
				} else if (chance < 50) {
					if (p1.withdrawalCoins(5.0)) {
						p2.depositCoins(5.0);
					} else {
						System.out.println(p1.getName() + " is broke, and loses the game.");
						break;
					}
				} else if (chance < 75) {
					if (p2.deductHealth(5) <= 0) {
						System.out.println(p2.getName() + " is dead, and loses the game.");
						break;
					}
				} else {
					if (p1.deductHealth(5) <= 0) {
						System.out.println(p1.getName() + " is dead, and loses the game.");
						break;
					}
				}
			}
		}
	}
}
