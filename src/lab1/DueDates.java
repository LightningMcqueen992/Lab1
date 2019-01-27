package lab1;

import java.util.Scanner;
/************************************************************************************************************
Purpose:  This class will model a due dates for assessments in a course
Author:  Linda Crane and xxxxxxxxxx
Course: F2018 - CST8130
Lab Section: xxxxxxxx
Data members:  

Methods:                                             
         

*************************************************************************************************************/

public class DueDates {
	private MyDate[] dueDates ;
	private MyDate retrieve = new MyDate();
	
	public DueDates() {
		//*****  write the code for this method here
		dueDates = new MyDate[10];
	}
	
	public DueDates(int max) {
		//*****  write the code for this method here
		dueDates = new MyDate[max];
	}
	
	public boolean inputDueDates(Scanner in) {
		//*****  write the code for this method here
		
		
		for(int i=0;i<dueDates.length;i++) {
			//object is inside loop so it creates a new one each time
			retrieve = new MyDate();
			retrieve.inputDate(in);
			dueDates[i]=retrieve;
		}
		return true;
	}
	
	
	public void addOne () {
		//*****  write the code for this method here
		retrieve.addOne(dueDates);
	}
	
	public String toString(int i) {
		//*****  write the code for this method here
		//return dueDates[i].year+" / "+dueDates[i].month+" / "+dueDates[i].day;
		return dueDates[i].toString();
		
	}

}

