package in.ineuron.main;

import java.util.Scanner;

public class Arrays2 {
	public static void main(String[] args) {
	// to store and display marks of 5 students
		
		int a[] =new int[5];
		System.out.println("Enter the marks need to display");
		Scanner scan =new Scanner(System.in);
		
		for(int i=0; i<a.length; i++) {
			
		System.out.println("enter the markrs of student  " +i);
		 a[i] =scan.nextInt();
		}
		
		System.out.println("enter the markrs of student are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" is marks is for the student" +i);
		}
	}

}
