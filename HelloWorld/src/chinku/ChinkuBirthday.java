package chinku;

import party.KidsParty;

public class ChinkuBirthday extends KidsParty {
	public static void games() {
		System.out.println("We will play musical chairs...");

	}

	public static void main(String[] args) {

		ChinkuBirthday chinkuBirthday = new ChinkuBirthday();
		chinkuBirthday.wish("Chinku");
		dance();
		int chairs = chinkuBirthday.seatingArrangements(20);
		System.out.println(" We need " + chairs + " chairs for seating guests");
		chinkuBirthday.playMusic();
		chinkuBirthday.returnGift();
		games();

	}

}
