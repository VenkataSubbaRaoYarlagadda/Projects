package in.ineuron.main;

public class Operators {
	public static void main(String[] args) {
		int a=6;
		int b=6;
		int res=a-b;
		int res2=a+b;
		int res3=a/b;
		int res4=a*b;
		
		System.out.println(res2 + " " +res+ " " +res3+ " " +res4);
		
		
		if(a>b) {
			System.out.println(a-b);
			
		}
		
		else if(a==b) {
			System.out.println(a*b);
		}
		else {
			System.out.println(a+b);
		}
	}

}
