package SMclass;

public class Piece {
	String game;
	String rank;
	
	public Piece (String game, String rank) {
		this.game = game;
		this.rank = rank;
		
	}
@Override	
	public String toString() {
		return "This is a " + rank + " used in a " + game + " game.";
	}


	public static String[] howMove(String rank) {
		String[] moveNumber = new String[2];
	
		switch(rank) {
		case "King": 
			moveNumber[0] = "any";
			moveNumber[1] = "1";
			break;
		case "Queen": 
			moveNumber[0] = "any";
			moveNumber[1] = "7";
			break;
		case "Rook": 
			moveNumber[0] = "a horizontal or vertical";
			moveNumber[1] = "7";
			break;
		case "Bishop": 
			moveNumber[0] = "a diagonal";
			moveNumber[1] = "7";
			break;
		case "Knight": 
			moveNumber[0] = "an L shape";
			moveNumber[1] = "3";
			break;
		case "Pawn": 
			moveNumber[0] = "a forward";
			moveNumber[1] = "1";
			break;
		}
		return moveNumber;
	}
}
