import java.util.ArrayList;
import java.util.Scanner;


class GameMenu {
	

	private ArrayList<String> list_of_actions;

	private int number_of_object;

	static int count;


	GameMenu (ArrayList<String> list_of_actions) {


		this.list_of_actions = list_of_actions;

		count++;


		this.number_of_object = count;



	}


	public void displayMenu () {



		for (String s: this.list_of_actions) {

			System.out.println(s);

		}

		


	}



	public String getAction () {


		if (number_of_object == 1) {

		System.out.println("Type a number to choose an action");

	}

		else {

			System.out.println("Please type a number that corresponds to one of the numbers next to the different options");
		}


		for (String s: this.list_of_actions) {

			System.out.println(s);

			}

		
		Scanner a_scanner = new Scanner(System.in);

		String user_choice = a_scanner.nextLine();

		return user_choice;



/*
		

		if (a_scanner.hasNextDouble() ){

			int user_choice = a_scanner.nextInt();
			
			if (user_choice < this.list_of_actions.size()+1) {

				
				System.out.println("You've chosen: " + user_choice);
			}

			else {


				System.out.println("That's not one of the options. Please type a number that corresponds to one of the numbers next to the different options");

			getAction();
			}
		}



			


			
			//a_scanner.nextLine();

		else {

			System.out.println("That's not a number. Please type a number that corresponds to one of the numbers next to the different options");

			getAction();



		}

		


*/
		}


}



