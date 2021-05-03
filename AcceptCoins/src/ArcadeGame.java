
public class ArcadeGame implements Coinable, Dispensable {
	
	int coins;
	
	public ArcadeGame(){
		this.coins = 0;
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Start to Play");
		System.out.println("...in game....");
		System.out.println("Game Ended\n" + "Try Again?");
		coins++;
		
	}

	@Override
	public void reload(int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean insertCoin() {
		// TODO Auto-generated method stub
		this.dispense();
		return false;
	}
	
	

}
