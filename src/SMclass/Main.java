package SMclass;

public class Main {

	public static void main(String[] args) {
		
//		Point p = new Point(3,4);
//		System.out.println(p);
//		
//		System.out.println();
//		
//		ColorPoint p2 = new ColorPoint(5,8,"blue");
//		System.out.println(p2);
//		
//		System.out.println();
//		System.out.println(p.getCoords());
//		System.out.println(p2.getCoords());
//		
//		System.out.println();
//		p.setCoords(30, 40);
//		
//		System.out.println(p.getCoords());
//		p2.setCoords(50,80);
//		System.out.println(p2.getCoords());
		
		
		String rank = "Queen";
		Piece chessman1 = new GamePiece("Chess", rank, "White");

		System.out.println(chessman1.toString());
		System.out.println("A " + rank + " can move in " 
				+ Piece.howMove(chessman1.rank)[0] 
				+ " direction for up to " 
				+ Piece.howMove(chessman1.rank)[1] + " square(s).");
		
		
	}

}
