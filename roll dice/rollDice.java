import java.util.Scanner;

public class rollDice {

	public static void main(String[] args) {
		int guess;
		int lives= 10;
		int die1;
		int die2;
		int sum;
		int rolls = 0;
		String ans=null;
		
		Scanner n= new Scanner (System.in);
		System.out.print("What is the sum you want to bet? (2-12): ");
		guess=n.nextInt();
		
		System.out.println();
		System.out.println("======================START========================");
		do {
			if(guess<=1 || guess>=13) {
				System.out.println("Error Number");
				break;
			}
	    
			die1 = (int) (Math.random() * 6)+1;
			die2 = (int) (Math.random() * 6)+1 ;
			sum = die1 + die2;
			rolls++;
			System.out.println();
			System.out.println("Your "+ rolls+ " roll has the sum of "+ sum);
			System.out.println("============================================");
			
	
			    if (guess==sum) {
			    	System.out.println("Congrats! You got it on the "+ rolls+ " time!");
			    	break;
			    }
			    else {
			    	lives--;
			    }
			    System.out.println("You have "+ lives +" lives left");
				
			    if(lives==0) {
			    	System.out.println("================================================");
			    	System.out.println("GAME OVER"+ "\n" +"You are out of tries, better luck next time! ");
			    	break;
			    }
			    
			    System.out.println();
			    System.out.print("Guess again? Y/N : ");
			    ans=n.next();
			    
		}
			while (ans.equalsIgnoreCase("Y"));
		if (ans.equalsIgnoreCase("N")) {
			System.out.println("Thank you for using the program!");
		}
		
	    }
	}
	
