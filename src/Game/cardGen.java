package Game;

import java.util.Random;

public class cardGen {
	private int n;
	public int Number(int howMany){
		Random r = new Random();
		n = r.nextInt(howMany);
		return n;
	}
	
}
