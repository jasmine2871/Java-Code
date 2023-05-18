package fan.BODIES;

public abstract class Body {
	
	private String IDNumber;
	private String BType;
	
	
	public Body(String IDNumber, String BType) {
		this.IDNumber = "x";
		this.BType = BType;
	}
	
	public abstract void displayInfo();

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String IDNumber) {
		this.IDNumber = IDNumber;
	}

	public String getBType() {
		return BType;
	}

	public void setBType(String BType) {
		this.BType = BType;
	}
	
	
	
	
}
