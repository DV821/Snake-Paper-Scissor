import java.util.*;
class game{

	public static String choice(int i){
		switch(i){
				case 1 : return "Stone";
				case 2 : return "Paper";
				case 3 : return "Scissors";
				default : return "Invalid Choice";
			}
	} 

	public static void main(String[] args) {
		String w = "";
		Scanner s = new Scanner(System.in);
		Random R = new Random();
		System.out.println("Welcome to game of Stone, Paper, Scissors");
		char c = 'y' ;
		do{
			System.out.print("\t1. Stone\n\t2. Paper\n\t3. Scissors\n\tEnter Your Choice : ");
			int n = s.nextInt();
			s.nextLine();
			int z= R.nextInt(3)+1;
			System.out.println("\tYou : "+ choice(n));
			System.out.println("\tComputer : "+ choice(z));
			
			// n = you    z = computer
			switch(n){
				case 1 : if(z==3)
							w="Win";
						 else if(z==2)
						 	w="Lose";
						 else
						 	w="Tie"; 
						break;
				case 2 : if(z==1)
							w="Win";
						 else if(z==3)
						 	w="Lose";
						 else
						 	w="Tie"; 
						break;
				case 3 : if(z==2)
							w="Win";
						 else if(z==1)
						 	w="Lose";
						 else
						 	w="Tie"; 
						break;
				default : break;
			}
			System.out.println("\n\t"+w.toUpperCase()+"\n");
			if(w=="Win"){
				System.out.print("\tPlay More? (Y/N) : ");
				c = s.next().charAt(0);
				System.out.println();
			}
		}while(c!='n' or c!='N');

	}
}
