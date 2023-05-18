package fan.PAD;

import fan.ENUMS.Side;
import fan.ENUMS.Status;

public class LeftFootPad extends FootPad{

	private Status LeftPadStatus;
	
	public LeftFootPad(String serialNumber) {
		super("LFP-1");
		this.setSide(Side.LEFT);
		this.LeftPadStatus = Status.ONLINE;
	}

	@Override
	public boolean padCheck() {
		if (this.LeftPadStatus == Status.ONLINE) {
			return true;
		} else {
			this.LeftPadStatus = Status.OFFLINE;
		}
		return false;
	}

	public Status getLeftPadStatus() {
		return LeftPadStatus;
	}

	public void setLeftPadStatus(Status leftPadStatus) {
		this.LeftPadStatus = leftPadStatus;
	}
	
	
}
