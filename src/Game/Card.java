package Game;

public class Card {
	private String cardName;
	private int cardAttack;
	private int cardHealth;
	public int turnPlayed;
	
	public Card(String cardName, int cardAttack, int cardHealth, int turnPlayed) {
		this.cardName = cardName;
		this.cardAttack = cardAttack;
		this.cardHealth = cardHealth;
		this.turnPlayed = turnPlayed;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public int getCardAttack() {
		return cardAttack;
	}

	public void setCardAttack(int cardAttack) {
		this.cardAttack = cardAttack;
	}

	public int getCardHealth() {
		return cardHealth;
	}

	public void setCardHealth(int cardHealth) {
		this.cardHealth = cardHealth;
	}
	
	public void decreaseCardHealthByOne() {
		this.cardHealth--;
	}

	
	public int getTurnPlayed() {
		return turnPlayed;
	}

	public void setTurnPlayed(int turnPlayed) {
		this.turnPlayed = turnPlayed;
	}
	
	
}
