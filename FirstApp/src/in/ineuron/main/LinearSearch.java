package in.ineuron.main;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,40,30,60,70,80,90};
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key that need to search");
		int key =sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				System.out.println("we found the value in the array is  "+a[i]);
				flag=true;
				break;
				
			}
			
		}
		if(flag==false) {
		System.out.println("not fpound");
		}

		//
		
	}

}
