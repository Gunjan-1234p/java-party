package party;

public class KidsParty implements Party {

	@Override
	public void wish(String name) {
	System.out.println("Happy birthday...to.."+ name);
	//return "its your birthday  "+ name;
		
	}

	@Override
	public void playMusic() {
		System.out.println("Play Music barbie..");

	}

	@Override
	public int seatingArrangements(int guest) {
		return guest;
	}


  public static void dance() {
	  System.out.println("Everyone is dancing");
	
}
  public  void returnGift() {
	  System.out.println("give everyone a chocolate...");
	
}
}
