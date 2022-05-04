package com.revature.pixott.handler;

import com.revature.pixott.app.App;

public class MainMenuHandler {
	public static void display() {
		System.out.println("----------------");
		System.out.println("Pixott Main Menu");
		System.out.println("----------------");
		System.out.println("1. Signup");
		System.out.println("2. Login");
		System.out.println("3. Display movielist");
		System.out.println("4. Exit");
		System.out.println("Enter option: ");
		int option = App.scanner.nextInt();
		if (option == 1) {
			SignupHandler.display();
			MainMenuHandler.display();
		}
		
		else if (option == 2) {
			LoginHandler.display();	
			
			
		}
		else if (option == 3) {
			MovieHandler.display();		
		}
	
		else if (option == 4) {
			System.out.println("Exit");
		}
		
	}

}
