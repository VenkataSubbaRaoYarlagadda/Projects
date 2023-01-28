package in.ineuron.main;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Dhoni");
		String s2=new String("Dhoni");
		String s3=new String("venkat");
		String s4=new String("india");
		String s5="King";
		String s6= "King";
		System.out.println(s1==s2);
		System.out.println(s5==s6);
		s3.concat("Yarlagadda");
		s3=s3.concat("Kavya");
		s3="Sachine";
		System.out.println(s3);
		String a1 =new String("Kiran");
		a1+="ID";
		System.out.println(a1);
		String a2 =a1.concat("KING");
		System.out.println(a2);

	}

}
