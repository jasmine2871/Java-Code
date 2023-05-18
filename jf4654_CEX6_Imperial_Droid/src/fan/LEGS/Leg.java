package fan.LEGS;

public abstract class Leg {
	
	private String IDNumber;
	private String LType;
	
	public Leg(String IDNumber, String LType) {
		this.IDNumber = IDNumber;
		this.LType = LType;
	}
	
	public abstract void displayInfo();

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String IDNumber) { 
		this.IDNumber = IDNumber;
	}

	public String getLType() {
		return LType;
	}

	public void setLType(String LType) {
		this.LType = LType;
	}
	
	
	
	
}
