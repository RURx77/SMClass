package SMclass;

public class ColorPoint extends Point {
	
	String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		
	}
	public ColorPoint(int x, String color) {
		this(x,0,color);
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + color;
	}
	
}
	
