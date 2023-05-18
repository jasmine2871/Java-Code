package fan.ARMS;

import fan.ENUMS.Limb;
import fan.ENUMS.Side;
import fan.ENUMS.Status;
import fan.PAD.LeftFootPad;

public class LeftArm extends Arm{

	private Status status;
	private LeftFootPad pad;

	public LeftArm(String serialNumber) {
		super("LA-01");
		this.status = Status.ONLINE;
		this.setSide(Side.LEFT);
		this.pad = new LeftFootPad(serialNumber); 
		this.setLower(Limb.Lower);
		this.setUpper(Limb.Upper);
	}

	public boolean armCheck() {
		if ((this.status == Status.ONLINE) && (this.pad.getLeftPadStatus() == Status.ONLINE)) {
			return true;
		} else {
			this.pad.setLeftPadStatus(Status.OFFLINE);
		}
		return false;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LeftFootPad getPad() {
		return pad;
	}

	public void setPad(LeftFootPad pad) {
		this.pad = pad;
	}
	
	

	
	

}
