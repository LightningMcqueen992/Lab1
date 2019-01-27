package lab1;

import java.util.Scanner;

/************************************************************************************************************
 * Purpose: This class is the method main for Lab 1 Author: Linda Crane and
 * xxxxxxxxxx Course: F2018 - CST8130 Lab Section: xxxxxxxx
 * 
 * 
 * 
 *************************************************************************************************************/

public class Lab1 {

	public static void main(String[] args) {
		
		//Adding a random comment here
		
		Scanner keyboard = new Scanner(System.in);
		DueDates run = new DueDates();
		int size = 0;
		String choice = "y";
		do {
			do {
				System.out.println("How many assessments in this course - must be greater than 0");
				if(!keyboard.hasNextInt()) {
					size = -1;
					System.out.println("Error please enter a number greater than 0");
					keyboard.next();
				}
				else if(keyboard.hasNextInt()){
					try {
					size = keyboard.nextInt();
					run = new DueDates(size);
					}catch(Exception E) {
						System.out.println("Invalid");
						continue;
					}
				}
					
				
			
			}while(size <= 0);
			
			if (run.inputDueDates(keyboard)) {
				System.out.println("The due dates are :");

				for (int i = 0; i < size; i++) {
					System.out.print(i + 1 + " : ");
					System.out.println(run.toString(i));
				}
			}

			System.out.println("Due dates with one day added are :");

			run.addOne();

			for (int i = 0; i < size; i++) {
				System.out.print(i + 1 + " : ");
				System.out.println(run.toString(i));
			}
			boolean flag = false;
			do {
			
			System.out.println("Do another (y/n)");
			if(keyboard.hasNext()) {
				
				choice = keyboard.next();
			}
			if( !choice.equals("n") && !choice.equals("y")) {
				flag = false;
			}
			else {
				flag = true;
			}
			}while(flag == false);
			
			
			
			
		} while (!choice.equals("n"));
	}

}
