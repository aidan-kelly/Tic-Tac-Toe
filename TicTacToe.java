import java.util.*;

public class TicTacToe {

	public static void main(String[] args) {
		
		//sets up the scanner
		Scanner sn = new Scanner(System.in);
		
		//welcomes user to the game
		System.out.println("Welcome to Tic-Tac-Toe!");
		
		//sets up our random object
		Random rand = new Random();
		
		//flip a coin
		int coinFlip = rand.nextInt(2);
		
		//create a variable
		boolean first;
		
		//if the coinFlip is zero, user goes first
		if(coinFlip == 0){
			System.out.println("You go first!");
			first = true;
			
		//coinFlip == 1 computer goes first
		}else{
			System.out.println("You go second!");
			first = false;
		}
		
		//set up the gameState
		String[][] gameState = {
				{" "," "," "},
				{" "," "," "},
				{" "," "," "}		
		};

		boolean gameDone = false;
		if(first == true){
			printBoard(gameState);
			while(!gameDone){
				System.out.println("Where would you like to place your peice?");
				int moveX = sn.nextInt();
				int moveY = sn.nextInt();
				placePeice(moveY,moveX,gameState);
				printBoard(gameState);
				//checkIfDone();
				//computerMove();
				//checkIfDone();
			}
			
		}else if(first == false){
			printBoard(gameState);
			System.out.println("Where would you like to place your peice?");
			placePeice(1,1,gameState);
			printBoard(gameState);
		}
		
		
		
		
	}
	
	
	
	
	public static void printBoard(String[][] gameState){
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		System.out.println("  0 1 2 ");
		for(String[] i : gameState){
			System.out.print(count3+" ");
			for(String j : i){
				System.out.print(j);
				if(count2<2){
					System.out.print("|");
				}
				count2++;
			}
			count2 = 0;
			System.out.println();
			if(count<2){
				System.out.println("  -----");
			}
			count++;
			count3++;
		}
	}
	
	public static void placePeice(int placeX, int placeY, String[][] gameState){
		gameState[placeX][placeY] = "X";
	}
	
	public static void computerMove(String[][] gameState){
		
	}
	
	

}
