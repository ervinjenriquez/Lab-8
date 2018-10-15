public class Rectangle implements Comparable<Rectangle> {
	
	private int height;
	private int width;
	private Point topCorner;
	
	public Rectangle (int height, int width, int cornerX, int cornerY) {
		this.height = height;
		this.width = width;
		topCorner = new Point(cornerX,cornerY);
	}
	
	//toString
	public String toString() {
		return "H: " + height + ", W: " + width + ", Corner: " + topCorner;
	}
	
	//Setters
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	
	//Getters
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public Point getTopCorner() {
		return topCorner;
	}
	

	public int compareTo(Rectangle o) {
		if (height < o.getHeight()) {
			return -1;
		} else if (height > o.getHeight()) {
			return 1;
		} else {
			if (width < o.getWidth()) {
				return -1;
			} else if (width > o.getWidth()) {
				return 1;
			} else {
				if(topCorner.compareTo(o.getTopCorner()) > 0) {
					return 1;
				} else if (topCorner.compareTo(o.getTopCorner()) < 0) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}
}
