package Game;

public class Card {
	private String cardName;
	private int cardAttack;
	private int cardHealth;
	public int turnPlayed;
	public boolean isSpell;
	
	public Card(String cardName, int cardAttack, int cardHealth, int turnPlayed) {
		this.cardName = cardName;
		this.cardAttack = cardAttack;
		this.cardHealth = cardHealth;
		this.turnPlayed = turnPlayed;
		this.isSpell = false;
	}
	
	public Card(String cardName, int cardAttack, int cardHealth, int turnPlayed, boolean isSpell) {
		this.cardName = cardName;
		this.cardAttack = cardAttack;
		this.cardHealth = cardHealth;
		this.turnPlayed = turnPlayed;
		this.isSpell = isSpell;
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
	
	public boolean checkIsSpell() {
		return isSpell;
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
