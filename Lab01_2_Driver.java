package Labs;




import java.util.Date;

public class Lab01_2_Driver {

	public static void main(String[] args) {
		new Lab01_2_Driver();
	}

	public Lab01_2_Driver() {

		Post myPost = new Post("Joshua Smith", new Date(), "My Post",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore "
						+ "et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut "
						+ "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse "
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in "
						+ "culpa qui officia deserunt mollit anim id est laborum.");

		String commentTest = "word0 ";
		for (int i = 0; i < 101; i++) {
			myPost.addComment(commentTest);
			commentTest += "word" + (i + 1) + " ";
		}

		System.out.println(myPost.getStrAuthor());
		System.out.println(myPost.getDateCreated());
		System.out.println(myPost.getStrTitle());
		System.out.println(myPost.getStrBody());
		for (int i = 0; i < myPost.getStrComments().length; i++) {
			System.out.println(myPost.getStrComments()[i]);
		}

	}

}
