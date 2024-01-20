package SMclass;


// new comment in GamePiece Class

public class GamePiece extends Piece{

	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	String player;
	public GamePiece(String game, String rank, String player) {
		super(game,rank);
		
		this.player = player;
		
	}
@Override
	public String toString() {
		return super.toString() + " It belongs to the " + this.player + " player.";
	}
}
