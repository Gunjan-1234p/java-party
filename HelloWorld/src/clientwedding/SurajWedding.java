package clientwedding;

import party.WeddingParty;

public class SurajWedding extends WeddingParty {
	
	public void playMusic(String musicName) {
		System.out.println("PLay music of " + musicName);
	}
	
	public static void main(String[] args) {
		
		SurajWedding party = new SurajWedding();
		party.wish("Suraj");
		party.wish(" "+"suraj"," "+"saroj");
	    party.playMusic();
	    party.playMusic("Neha Kakkar");
		
	}
	

}
