package fan.PAD;

import fan.ENUMS.Side;
import fan.ENUMS.Status;

public class RightFootPad extends FootPad{

	private Status RightPadStatus;
	
	public RightFootPad(String serialNumber) {
		super("RFP-2");
		this.setSide(Side.RIGHT);
		this.RightPadStatus = Status.ONLINE;
	}

	@Override
	public boolean padCheck() {
		if (this.RightPadStatus == Status.ONLINE) {
			return true;
		} else {
			this.RightPadStatus = Status.OFFLINE;
		}
		return false;
	}

	public Status getRightPadStatus() {
		return RightPadStatus;
	}

	public void setRightPadStatus(Status rightPadStatus) {
		this.RightPadStatus = rightPadStatus;
	}
	
	
	
	

}
