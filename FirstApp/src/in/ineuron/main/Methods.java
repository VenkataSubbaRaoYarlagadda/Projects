package in.ineuron.main;

class Calc {

//	/*
//	 * //int a,b,c;
//	 * 
//	 * void add() { a=10; b=20; c=a+b; // instance variable int res =a+c; /// res is
//	 * local variable System.out.println(c); }
//	 * 
//	 * 
//	 * 
//	 * 
//	 * int res; void add(int a, int b) { res =a+b; System.out.println(res); }
//	 */

	int a, b, res;

	int add() {
		a = 10;
		b = 20;
		res = a + b;
		return res;
	}
}

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		/* calc.add(); */
		/* calc.add(10, 20); */

		int c = calc.add();
		System.out.println(c);

	}

}
