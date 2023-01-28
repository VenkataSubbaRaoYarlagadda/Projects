package in.ineuron.main;

import java.util.Scanner;

// the 4 class has 4 subjects and 6 people 
public class Array4d {

	public static void main(String[] args) {
		int a[][][] =new int[2][3][3];
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					
					System.out.println("Enter marks of class " +i+ " Student " +j+ "and grade"+k);
					
					a[i][j][k] =sc.nextInt();
					
					
				}
				
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter marks of class " +i+ " Student " +j+ "and grade"+k+ " is   " +a[i][j][k]);
						
				}
			}
		}
		
		

	}

}
