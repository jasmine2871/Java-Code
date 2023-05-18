package fan.ENUMS;

public enum Battery {
	// R3 and R4 are batteries
	R3("Lithium", 1000),
	R4("Trithium", 2000);
	
	private String type;
	private int amps;
	
	private Battery(String type, int amps) {
		this.type = type;
		this.amps = amps;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmps() {
		return amps;
	}

	public void setAmps(int amps) {
		this.amps = amps;
	}
	
	
	
	
}
