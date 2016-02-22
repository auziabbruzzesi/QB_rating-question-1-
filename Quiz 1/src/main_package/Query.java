package main_package;

import java.util.Scanner;

public class Query {
	static Scanner user_input = new Scanner(System.in);
	public static double askForData(String request){
		
		System.out.print(request);//print the request in the console
		double input = user_input.nextInt();
		//user_input.close();
		return input;
		
	}

}
