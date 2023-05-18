package fan.ARMS;

public abstract class Arm {
	
	private String IDNumber;
	private String AType;
	
	public Arm(String IDNumber, String AType) {
		this.IDNumber = IDNumber;
		this.AType = AType;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String IDNumber) {
		this.IDNumber = IDNumber;
	}

	public String getAType() {
		return AType;
	}

	public void setAType(String AType) {
		this.AType = AType;
	}
	
	
	 
}
