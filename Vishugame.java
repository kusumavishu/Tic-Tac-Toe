
import java.util.Random;
import java.util.Scanner;

class Vishugame{
	boolean player1=true;
	int value1;
	static Object[][] array={
			{7, 8, 9},
			{4, 5, 6},
			{1, 2, 3}
	};
	private int randomNumber;

	//printing empty pattern
	void pattern(){
		String move=" ";
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(move);
				if(j!=2){
					System.out.print("  "+"|"+"  ");
				}
			}
			System.out.println();
			if(i!=2){
				System.out.println("---+-----+---");
			}
		}
		program();
	}

	//program
	private void program(){
		if (player1){
			System.out.print("player1 move --> ");
			Scanner input=new Scanner(System.in);
			value1 =input.nextInt();
			if(value1>9 || value1<1){
				System.out.println("Please enter correct grid value 1-9");
				program();
			}
			if (!(check())){
				System.out.println("Already filled please enter correct grid value 1-9 :");
				program();
			}
			player1=false;
			patternX(value1);

		}
		else {
			System.out.println("NOW IT's MY TURN(player2 move)");
			//patternO(); genarate computer number
			hardcondition();

			boolean found=false;
			Random random = new Random();
			while (true) {
				if(array[1][1] instanceof Integer){
					randomNumber=5;
					found=true;
					break;
				}
				// Generates a number between 1 and 9
				randomNumber = random.nextInt(9) + 1;
//				System.out.println("Random number (1-9): " + randomNumber);


				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (array[i][j] instanceof Integer && array[i][j].equals(randomNumber)) {
//							System.out.println("Found " + randomNumber + " at position: [" + i + "][" + j + "]");
							found = true;
							break;
						}

					}
					if (found) break;
				}

				if(found) break;


			}

			 patternO(randomNumber);

		}
	}

	private boolean check() {
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				if((array[i][j].equals(value1))){
					return true;
				}
			}
		}
		return false;
	}

	private void patternO(int randomNumber) {

		//replacing the value with O
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j].equals(randomNumber)) {
					array[i][j] = "O";
				}
			}
		}
		//print the array
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(array[i][j].equals("X")|| array[i][j].equals("O")){
					System.out.print(array[i][j]);
				}else {
					System.out.print(" ");
				}

				if(j!=2){
					System.out.print("  "+"|"+"  ");
				}
			}
			System.out.println();
			if(i!=2){
				System.out.println("---+-----+---");
			}
		}
		wincondition();
		player1=true;
		program();
	}
	private void wincondition(){
		if(array[0][0]=="X" && array[0][1]=="X" && array[0][2]=="X" ){
			System.out.println("Congratulations on the amazing move..! you're the winner...!");
			System.exit(0);

		}
		else if(array[1][0]=="X" && array[1][1]=="X" && array[1][2]=="X" ){
			System.out.println("Congratulations on the amazing move..! you're the winner...!");
			System.exit(0);
		}
		else if(array[2][0]=="X" && array[2][1]=="X" && array[2][2]=="X" ){
			System.out.println("Congratulations on the amazing move..! you're the winner...!");
			System.exit(0);
		}
//
		else if(array[0][0]=="X" && array[1][1]=="X"&& array[2][2]=="X"){
			System.out.println("Congratulations on the amazing move..! you're the winner...!");
			System.exit(0);
		}

		else if(array[2][0]=="X" && array[1][1]=="X" && array[0][2]=="X"){
			System.out.println("Congratulations on the amazing move..! you're the winner...!");
			System.exit(0);
		}
//
		else if(array[0][0]=="X" && array[1][0]=="X" && array[2][0]=="X" ){
			System.out.println("Congratulations on the amazing move..! you're the winner...!");
			System.exit(0);

		}
		else if(array[0][1]=="X" && array[1][1]=="X" && array[2][1]=="X" ){
			System.out.println("Congratulations on the amazing move..! you're the winner...!");
			System.exit(0);

		}
		else if(array[0][2]=="X" && array[1][2]=="X" && array[2][2]=="X" ){
			System.out.println("Congratulations on the amazing move..! you're the winner...!!");
			System.exit(0);

		}
		//----------------------------for patternO-----------------------
		else if(array[0][0]=="O" && array[0][1]=="O" && array[0][2]=="O" ){
			System.out.println("I'm the winner..! Better luck next time..!");
			System.exit(0);

		}

		else if(array[1][0]=="O" && array[1][1]=="O" && array[1][2]=="O" ){
			System.out.println("I'm the winner..! Better luck next time..!");
			System.exit(0);
		}

		else if(array[2][0]=="O" && array[2][1]=="O" && array[2][2]=="O" ){
			System.out.println("I'm the winner..! Better luck next time..!");
			System.exit(0);
		}
		else if(array[0][0]=="O" && array[1][1]=="O"&& array[2][2]=="O"){
			System.out.println("I'm the winner..! Better luck next time..!");
			System.exit(0);
		}

		else if(array[2][0]=="O" && array[1][1]=="O" && array[0][2]=="O"){
			System.out.println("I'm the winner..! Better luck next time..!");
			System.exit(0);
		}
		else if(array[0][0]=="O" && array[0][1]=="O" && array[0][2]=="O" ){
			System.out.println("I'm the winner..! Better luck next time..!");
			System.exit(0);

		}
		else if(array[0][0]=="O" && array[1][0]=="O" && array[2][0]=="O" ){
			System.out.println("I'm the winner..! Better luck next time..!");
			System.exit(0);

		}
		else if(array[0][1]=="O" && array[1][1]=="O" && array[2][1]=="O" ){
			System.out.println("I'm the winner..! Better luck next time..!");
			System.exit(0);

		}
		else if(array[0][2]=="O" && array[1][2]=="O" && array[2][2]=="O" ){
			System.out.println("I'm the winner..! Better luck next time..!");
			System.exit(0);

		}
		//-----------------no grid number close-------------------------
		else {
			int count=0;
			for (int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(array[i][j]instanceof Integer){
						count++;
					}
				}
			}
			if(count==0){
				System.out.println("No One Win the Game..! Tie Game..! Mutual Draw..!");
				System.out.println("Game Over..........!");
				System.out.println("Try again");
				System.exit(0);
			}
		}

	}

	private void hardcondition() {

		//-------------------------FOR XX--O-------------------------------------
//rows 1
		if(array[0][0]=="O" && array[0][1]=="O" && array[0][2] instanceof Integer ){
			int value1=9;
			patternO(value1);

		}
		else if(array[0][0]=="O" && array[0][1] instanceof Integer && array[0][2]=="O"){
			int value1=8;
			patternO(value1);
		}
		else if(array[0][0] instanceof Integer && array[0][1]=="O" && array[0][2]=="O"){
			int value1=7;
			patternO(value1);
		}
//row2
		else if(array[1][0]=="O" && array[1][1]=="O" && array[1][2] instanceof Integer ){
			int value1=6;
			patternO(value1);
		}
		else if(array[1][0]=="O" && array[1][1] instanceof Integer &&  array[1][2]=="O"){
			int value1=5;
			patternO(value1);
		}
		else if(array[1][0] instanceof Integer && array[1][1]=="O" && array[1][2]=="O"){
			int value1=4;
			patternO(value1);
		}
//row3
		else if(array[2][0]=="O" && array[2][1]=="O" && array[2][2] instanceof Integer ){
			int value1=3;
			patternO(value1);
		}
		else if(array[2][0]=="O" && array[2][1] instanceof Integer && array[2][2]=="O"){
			int value1=2;
			patternO(value1);
		}
		else if( array[2][0] instanceof Integer && array[2][1]=="O" && array[2][2]=="O"){
			int value1=1;
			patternO(value1);
		}
//diagonal1
		else if(array[0][0]=="O" && array[1][1]=="O"&& array[2][2] instanceof Integer){
			int value1=3;
			patternO(value1);
		}
		else if(array[0][0]=="O" && array[1][1] instanceof Integer && array[2][2]=="O"){
			int value1=5;
			patternO(value1);
		}
		else if(array[0][0] instanceof Integer && array[1][1]=="O" && array[2][2]=="O"){
			int value1=7;
			patternO(value1);
		}
//diagonal2
		else if(array[2][0]=="O" && array[1][1]=="O" && array[0][2] instanceof Integer){
			int value1=9;
			patternO(value1);
		}
		else if(array[2][0]=="O" && array[1][1]instanceof Integer && array[0][2]=="O"){
			int value1=5;
			patternO(value1);
		}
		else if(array[2][0]instanceof Integer && array[1][1]=="O" && array[0][2]=="O"){
			int value1=1;
			patternO(value1);
		}
//column1
		else if(array[0][0]instanceof Integer && array[1][0]=="O" && array[2][0]=="O" ){
			int value1=7;
			patternO(value1);
		}
		else if(array[0][0]=="O" && array[1][0]instanceof Integer && array[2][0]=="O" ){
			int value1=4;
			patternO(value1);
		}
		else if(array[0][0]=="O" && array[1][0]=="O" && array[2][0]instanceof Integer ){
			int value1=1;
			patternO(value1);
		}
//column2
		else if(array[0][1]instanceof Integer && array[1][1]=="O" && array[2][1]=="O" ){
			int value1=8;
			patternO(value1);
		}
		else if(array[0][1]=="O" && array[1][1]instanceof Integer && array[2][1]=="O" ){
			int value1=5;
			patternO(value1);
		}
		else if(array[0][1]=="O" && array[1][1]=="O" && array[2][1]instanceof Integer ){
			int value1=2;
			patternO(value1);
		}
//column3
		else if(array[0][2]instanceof Integer && array[1][2]=="O" && array[2][2]=="O" ){
			int value1=9;
			patternO(value1);
		}
		else if(array[0][2]=="O" && array[1][2]instanceof Integer && array[2][2]=="O" ){
			int value1=6;
			patternO(value1);
		}
		else if(array[0][2]=="O" && array[1][2]=="O" && array[2][2]instanceof Integer ){
			int value1=3;
			patternO(value1);
		}


		//----------------------For XX--O------------------------------
//ROW1--XX
		if(array[0][0]=="X" && array[0][1]=="X" && array[0][2] instanceof Integer ){
			int value1=9;
			patternO(value1);

		}
		else if(array[0][0]=="X" && array[0][1] instanceof Integer && array[0][2]=="X"){
			int value1=8;
			patternO(value1);
		}
		else if(array[0][0] instanceof Integer && array[0][1]=="X" && array[0][2]=="X"){
			int value1=7;
			patternO(value1);
		}
//ROW2--XX
		else if(array[1][0]=="X" && array[1][1]=="X" && array[1][2] instanceof Integer ){
			int value1=6;
			patternO(value1);
		}
		else if(array[1][0]=="X" && array[1][1] instanceof Integer &&  array[1][2]=="X"){
			int value1=5;
			patternO(value1);
		}
		else if(array[1][0] instanceof Integer && array[1][1]=="X" && array[1][2]=="X"){
			int value1=4;
			patternO(value1);
		}
//ROWS3--XX
		else if(array[2][0]=="X" && array[2][1]=="X" && array[2][2] instanceof Integer ){
			int value1=3;
			patternO(value1);
		}
		else if(array[2][0]=="X" && array[2][1] instanceof Integer && array[2][2]=="X"){
			int value1=2;
			patternO(value1);
		}
		else if( array[2][0] instanceof Integer && array[2][1]=="X" && array[2][2]=="X"){
			int value1=1;
			patternO(value1);
		}
//DIAGONAL1--XX
		else if(array[0][0]=="X" && array[1][1]=="X"&& array[2][2] instanceof Integer){
			int value1=3;
			patternO(value1);
		}
		else if(array[0][0]=="X" && array[1][1] instanceof Integer && array[2][2]=="X"){
			int value1=5;
			patternO(value1);
		}
		else if(array[0][0] instanceof Integer && array[1][1]=="X"&& array[2][2]=="X"){
			int value1=7;
			patternO(value1);
		}
//DIAGONAL2--XX
		else if(array[2][0]=="X" && array[1][1]=="X" && array[0][2] instanceof Integer){
			int value1=9;
			patternO(value1);
		}
		else if(array[2][0]=="X" && array[1][1]instanceof Integer && array[0][2]=="X"){
			int value1=5;
			patternO(value1);
		}
		else if(array[2][0]instanceof Integer && array[1][1]=="X" && array[0][2]=="X"){
			int value1=1;
			patternO(value1);
		}
//COLUMNS1--XX
		else if(array[0][0]instanceof Integer && array[1][0]=="X" && array[2][0]=="X" ){
			int value1=7;
			patternO(value1);
		}
		else if(array[0][0]=="X" && array[1][0]instanceof Integer && array[2][0]=="X" ){
			int value1=4;
			patternO(value1);
		}
		else if(array[0][0]=="X" && array[1][0]=="X" && array[2][0]instanceof Integer ){
			int value1=1;
			patternO(value1);
		}
//COLUMNS2--XX
		else if(array[0][1]instanceof Integer && array[1][1]=="X" && array[2][1]=="X" ){
			int value1=8;
			patternO(value1);
		}
		else if(array[0][1]=="X" && array[1][1]instanceof Integer && array[2][1]=="X" ){
			int value1=5;
			patternO(value1);
		}
		else if(array[0][1]=="X" && array[1][1]=="X" && array[2][1]instanceof Integer ){
			int value1=2;
			patternO(value1);
		}
//COLUMNS3--XX
		else if(array[0][2]instanceof Integer && array[1][2]=="X" && array[2][2]=="X" ){
			int value1=9;
			patternO(value1);
		}
		else if(array[0][2]=="X" && array[1][2]instanceof Integer && array[2][2]=="X" ){
			int value1=6;
			patternO(value1);
		}
		else if(array[0][2]=="X" && array[1][2]=="X" && array[2][2]instanceof Integer ){
			int value1=3;
			patternO(value1);
		}
	}

	private void patternX(int value1) {
		//replacing the value with X
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (array[i][j].equals(value1)) {
					array[i][j] = "X";
				}
			}
		}
		//print the array
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(array[i][j].equals("X")|| array[i][j].equals("O")){
					System.out.print(array[i][j]);
				}else {
					System.out.print(" ");
				}

				if(j!=2){
					System.out.print("  "+"|"+"  ");
				}
			}
			System.out.println();
			if(i!=2){
				System.out.println("---+-----+---");
			}
		}
		wincondition();
		program();

	}


	//no change requried don't touch
	public static void main(String[]args){
		Vishugame obj=new Vishugame();
		System.out.println("Player1 = X");
		System.out.println("Player2 CPU = O");
		System.out.println("Rules: Please Enter only number 1-9 ");
		System.out.println("Follow This Pattern");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(array[i][j]);
				if(j!=2){
					System.out.print("  "+"|"+"  ");
				}
			}
			System.out.println();
			if(i!=2){
				System.out.println("---+-----+---");
			}
		}
		System.out.println();
		System.out.println("Let's Start the game");
		obj.pattern();
	}
}

