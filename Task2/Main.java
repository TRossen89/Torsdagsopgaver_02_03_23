import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;


class Main {



	public static void main (String [] args) {


		System.out.println("Please type your name");

		Scanner a_scanner = new Scanner(System.in);


		String user_name = a_scanner.nextLine(); 

		System.out.println("Hi " + user_name + ". Please type your age");




		int age_of_user = a_scanner.nextInt();


		System.out.println("You say you're " + age_of_user);




		int years_to_retirement = 67 - age_of_user;


		System.out.println("You can retire in " + years_to_retirement + " years");




a





	}


}