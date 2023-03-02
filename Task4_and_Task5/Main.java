import java.util.ArrayList;



class Main {



	public static void main (String [] args) {


		ArrayList<String> actions = new ArrayList<String>();

		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");


		
		GameMenu a_game = new GameMenu(actions);


		//a_game.displayMenu();

		String action_of_user = a_game.getAction();

		doAction(Integer.parseInt(action_of_user));

}



	public static void doAction(int action) {


		
		switch(action) {

			case 1: System.out.println("Starting the game now");
				break;

			case 2: System.out.println("Fetching previously saved game data");
				break;

			case 3: System.out.println("Game paused");
				break;

			case 4: System.out.println("Ending game");
				break;

			default:

				System.out.println("Thats not an option.");


				ArrayList<String> actions = new ArrayList<String>();

				actions.add("1) Start game");
				actions.add("2) Resume game");
				actions.add("3) Pause game");
				actions.add("4) End game");

				GameMenu a_game_1 = new GameMenu(actions);

				String new_user_action = a_game_1.getAction();

				doAction(Integer.parseInt(new_user_action));


		}


	}



}