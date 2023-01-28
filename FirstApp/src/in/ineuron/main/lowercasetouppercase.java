package in.ineuron.main;

public class lowercasetouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		  char ch='a'; ch =(char) (ch-32); System.out.println(ch);
//		 

		String k1 = "venkat";
		String k2 = "";

		for (int i = 0; i < k1.length(); i++) {

			k2=k2+(char)(k1.charAt(i)-32);

		}
		System.out.println(k2);

	}

}
