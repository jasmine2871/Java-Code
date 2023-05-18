package fan.ENUMS;

public enum Radar {
	
	R4R("Doppler",500);
	
	private String type;
	private int range;
	
	
	private Radar(String type, int range) {
		this.type = type;
		this.range = range;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	

	
}
