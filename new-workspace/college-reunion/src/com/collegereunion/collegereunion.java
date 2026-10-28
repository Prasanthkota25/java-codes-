package com.collegereunion;

import java.util.Scanner;

public class collegereunion {

	public void displayInvitation(int availableStudentCount) {
		System.out.println(" URCE Reunion Invitation ");
		System.out.println("Dear Alumni,");
		System.out.println("We are thrilled to invite you to a special gathering that takes us back to");
		System.out.println("the golden days of laughter and unforgettable memories.");

		if (availableStudentCount > 100) {
			System.out.println(" Venue: Usha Rama College Grounds");
		} else {
			System.out.println(" Venue: Usha Rama College Seminar Hall");
		}
		System.out.println(" Date: 10th August 2025");
		System.out.println(" Time: 3:00 PM onwards");
		System.out.println("We can't wait to see you there");
		System.out.println("Thank you");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		collegereunion invitation = new collegereunion();

		System.out.print("Enter the number of students attending the reunion: ");
		int availableStudentCount = scanner.nextInt();

		invitation.displayInvitation(availableStudentCount);

	}

}
