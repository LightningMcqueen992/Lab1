package lab1;

import java.util.Scanner;

/************************************************************************************************************
 * Purpose: This class will model a simple date by keeping day, month and year
 * information. Leap years are NOT accommodated in this class. Author: Linda
 * Crane and xxxxxxxxxx Course: F2018 - CST8130 Lab Section: xxxxxxxx Data
 * members: day : int - value between 1 and 31 inclusive (depending on value in
 * month) month: int - value between 1 and 12 inclusive year: int - positive
 * value Methods: default constructor - sets date to Jan 1, 2018 toString ():
 * String - prints date in year/moht/day format inputDate(Scanner): boolean -
 * reads a valid date from the Scanner parameter and returns through boolean
 * success or not addOne(): void - adds one to the day field and then adjusts
 * month and year as needed.
 * 
 * 
 *************************************************************************************************************/
public class MyDate {
	
	private int day = 1;
	private int month = 1;
	private int year = 2018;

	public MyDate() {
	}

	public String toString() {
		return new String("" + year + "/" + month + "/" + day);
	}

	public boolean inputDate(Scanner in) {
		month = 0;
		day = 0;
		year = 0;
		do {

			System.out.print("Enter month - between 1 and 12: ");
			if (in.hasNextInt())
				this.month = in.nextInt();
			else {
				System.out.println("Invalid month input");
				in.next();
			}
		} while (this.month <= 0 || this.month > 12);

		do {

			System.out.print("Enter day - between 1 and 31: ");
			if (in.hasNextInt())
				this.day = in.nextInt();
			else {
				System.out.println("Invalid day input");
				in.next();
			}
		} while (this.day <= 0 || this.day > 31 || (this.month == 2 && this.day > 29)
				|| (this.day > 30 && (this.month == 9 || this.month == 4 || this.month == 6 || this.month == 11)));

		do {
			System.out.print("Enter year: ");
			if (in.hasNextInt())
				this.year = in.nextInt();
			else {
				System.out.println("Invalid day input");
				in.next();
			}
		} while (this.year <= 0);

		return true;
	}

	public void addOne (MyDate[] array){
			// *********    write the code for this method here  **************
			int[] thirty = {4,6,9,11};
			int[] thirtyOne = {1,3,5,7,8,10,12};
			
			int check =0;
			for(int i=0;i<array.length;i++) {
				
				for(int j=0;j<thirty.length;j++) {
					if(thirty[j]==array[i].month) {
						check = 1;
					}
				}
				for(int k=0;k<thirtyOne.length;k++) {
					if(thirtyOne[k]==array[i].month) {
						check =0;
					}
				}
				//if month ends in 30 than check is 1 
				// Checks to see if change to new year
				if(array[i].month == 12 && array[i].day == 31) {
					array[i].day=1;
					array[i].year=array[i].year+1;
					array[i].month=1;
				}
				//Checks to see if month is last day of February
				else if(array[i].month == 2 && array[i].day >= 29) {
					array[i].day= 1;
					array[i].month = array[i].month+1;
				}
			
				else if(check==1 && array[i].day==30) {
					array[i].day = 1;
					array[i].month = array[i].month+1;
				}
				else if(check==0 && array[i].day==31) {
					array[i].day = 1;
					array[i].month = array[i].month+1;
				}
				
				else {
					array[i].day=array[i].day+1;
					
				}
			}
			
				
		}



}
