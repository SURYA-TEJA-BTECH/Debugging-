package com.surya;

import java.util.Scanner;

//ctrl+shift+b  ==> To keep a breakPoint
//step into     ===> To go To method def 
//step over     ====> line by line flow  
//step return   =====>control comes to the caller after executing the code
/*drop to frame ======> To see the code flow of that method again
 for example u are seeing the flow of the donateMoney method
in that method after seeing the code flow of some lines u did not understood 
u want to see the code flow from starting again  then u can use drop  to frame */
//run to line control goes  to line where we pointed the cursor
//step filter   ===> to filter the packages in debugging
//resume        ====>To jump from one  break point to next breakpoint 
// how to remove all breakpoints 
// no of threads =no of stacks 
//main thread
//main method stack frame

public class A {

	public static void main(String[] args) {

		A a = new A();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();

		a.sendBirthdayWishes(name);

		a.sendOff();
		a.donateMoney();

	}

	public void sendOff() {
		System.out.println("bye .bye ");

	}

	private void donateMoney() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		double donationAmount = number * 5 * 3;

		System.out.println(donationAmount + " amount donated to  trust ");

	}

	public void sendBirthdayWishes(String name) {

		System.out.println(" ready to send BirthdayWishes()");

		for (int i = 0; i <= 2; i++) {

			System.out.println(i + " HAPPY BITRTHDAY " + name);

		}

		System.out.println("sucessfully sent the wishes to " + name);

		Scanner sc = new Scanner(System.in);
		System.out.println("which type of cake u want ");
		String cake = sc.next();

		cakeCutting(cake);

	}

	private void cakeCutting(String cake) {

		System.out.println(cake);
		System.out.println("cake cutting is started ");
		System.out.println("cake cutting is ended");

		distrubuteChoclates();

	}

	private void distrubuteChoclates() {

		System.out.println("Distributing of chaocaltes started ");

		for (int i = 0; i <= 2; i++) {

			System.out.println("Distributing");

		}

		System.out.println("ditrubiton is completed");

	}

}
