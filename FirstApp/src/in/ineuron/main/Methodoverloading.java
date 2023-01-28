package in.ineuron.main;
// same method name and used differnt parameters in the main method
class calc{
	int add(int a, int b){
		
		return a+b;
	}
	float add(float a, float b){
		
		return a+b;
	}
double add(double a, double b){
		
		return a+b;
	}
	
	
}


public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=4;
		float x=4.5f,y=6.4f;
		double m=4.5,n=6.5;
		
		calc c=new calc();
		
		System.out.println(c.add(a,b));
		System.out.println(c.add(x,y));
		System.out.println(c.add(m,n));

	}

}
