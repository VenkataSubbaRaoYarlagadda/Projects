package in.ineuron.main;
import java.util.*;



class Guesser{
	int guessNunm;
	
	int GuessNum(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Kindly guess the number from p1");
		guessNunm =sc.nextInt();
		return guessNunm;
	}
	
}
class Player{
int guessNunm;
	
	int GuessNum(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Kindly Player guess the number");
		guessNunm =sc.nextInt();
		return guessNunm;
	
	
}
}
	class Umpire{
		int numFormGusser;
		int numfromP1;
		int numfromP2;
		int numfromP3;
				void CollectNumFromGusser(){
			Guesser g= new Guesser();
			numFormGusser =g.GuessNum();
		}
				void CollectNumfromPlayer(){
			Player p1 =new Player();
			Player p2 =new Player();
			Player p3 =new Player();
			numfromP1 =p1.GuessNum();
			numfromP2 =p2.GuessNum();
			numfromP3 =p3.GuessNum();
				
		}
				void compare(){
			if(numFormGusser==numfromP1) {
				System.out.println("Player 1 won the game");
				
			}else if(numFormGusser==numfromP2){
				System.out.println("Player 2 won the game");
				
			}
			else if(numFormGusser==numfromP3){
				System.out.println("Player 3 won the game");
			}
			else {
				System.out.println("Game Lost");
			}
			
		}
		
	}


public class Gussergame {

	public static void main(String[] args) {
		
		Umpire u=new Umpire();
		u.CollectNumFromGusser();
		u.CollectNumfromPlayer();
		u.compare();
		

	}

}
