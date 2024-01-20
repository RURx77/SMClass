package SMclass;

public class Point {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x = " + x + "\ny = " + y;
	}
	
	public String getCoords() {
		return x + "," + y;
	}
	public void setCoords(int a, int b) {
		this.x = a;
		this.y = b;
	}
}