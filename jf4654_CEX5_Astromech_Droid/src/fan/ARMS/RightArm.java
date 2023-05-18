package fan.ARMS;

import fan.ENUMS.Limb;
import fan.ENUMS.Side;
import fan.ENUMS.Status;
import fan.PAD.RightFootPad;

public class RightArm extends Arm{
	
	private Status status;
	private RightFootPad pad;

	public RightArm(String serialNumber) {
		super("RA-02");
		this.status = Status.ONLINE;
		this.setSide(Side.RIGHT);
		this.pad = new RightFootPad(serialNumber); 
		this.setLower(Limb.Lower);
		this.setUpper(Limb.Upper);
	}
	
	public boolean armCheck() {
		if ((this.status == Status.ONLINE) && (this.pad.getRightPadStatus() == Status.ONLINE)) {
			return true;
		} else {
			this.pad.setRightPadStatus(Status.OFFLINE);
		}
		return false;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public RightFootPad getPad() {
		return pad;
	}

	public void setPad(RightFootPad pad) {
		this.pad = pad;
	}
	
	
	
}
