import  java.util.Scanner;

public class Person {
	private int coins;
	
	public Person(int coins) {
		this.coins = coins;
	}
	
	public void insertCoin(Coinable coinable) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nInsert Coin:  ");
	      coins = input.nextInt();
	      input.nextLine();
		
	      coins--;
                
		 System.out.println("Remaining coins: " + coins);

		if(!coinable.insertCoin()) 
			coins ++;
		
	}
		

	

}
