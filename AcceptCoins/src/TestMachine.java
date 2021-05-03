
public class TestMachine {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Arcade\n" + "--1 Coin per Game--");
		System.out.println("4 Tries Only, Goodluck!");
		ArcadeGame arcadeGame = new ArcadeGame();
		Person person = new Person(4);
		
		person.insertCoin(arcadeGame);
		person.insertCoin(arcadeGame);
		person.insertCoin(arcadeGame);
		person.insertCoin(arcadeGame);
	}

}
