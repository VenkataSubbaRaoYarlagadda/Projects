package in.ineuron.main;

////This is array 2d
import java.util.Scanner;

public class array3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int a[][] =new int[3][4];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter marks of class " +i+ " Student " +j);
				a[i][j] =sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("the marks of class " +i+ " Student " +j+ "is" +a[i][j] );
			}
		}
	}

}
