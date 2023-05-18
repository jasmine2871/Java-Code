package fan.SUPPORT;

public class Location {
	
	private int X;
	private int Y;
	private int Z;
	
	public Location(int x, int y, int z) {
		this.X = x;
		this.Y = y;
		this.Z = z;
	}

	@Override
	public String toString() {
		return "Location [X:" + this.X + ", Y:" + this.Y + ", Z:" + this.Z + "]";
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		this.X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		this.Y = y;
	}

	public int getZ() {
		return Z;
	}

	public void setZ(int z) {
		this.Z = z;
	}
	
	
	
	
	
}
