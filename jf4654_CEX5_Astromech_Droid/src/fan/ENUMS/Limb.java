package fan.ENUMS;

public enum Limb {
	
	Upper("Upper",1),
	Lower("Lower",2);
	
	private String type;
	private int value;
	
	
	private Limb(String type, int value) {
		this.type = type;
		this.value = value;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
}
