package in.ineuron.main;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,20,30,40,50,60,70,80,90};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key that need to search");
		int key =sc.nextInt();
		int low =0;
		int high =ar.length-1;
		while(low<=high) {
			int mid =(low+high)/2;
			
			if(key==ar[mid]) {
				System.out.println("key found at index"+mid);
				break;
				
			}
			else if(key<ar[mid]) {
				high =mid-1;
				
			}
			else if(key>ar[mid]) {
				low=mid+1;
			}
			
		}
		if(low>high) {
			System.out.println("Key not found");
		}
		
	}

}
