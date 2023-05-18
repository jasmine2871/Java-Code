package fan.PAD;

import fan.ENUMS.Side;

public abstract class FootPad {
	
	private String serialNumber;
	private Side side;
	
	public FootPad(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public abstract boolean padCheck();

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}
	
	
	
}
