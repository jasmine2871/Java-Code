package fan.DROID;

import fan.ARMS.LeftArm;
import fan.ARMS.RightArm;
import fan.CHASIS.Chasis;
import fan.DOME.SensorDome;
import fan.ENUMS.Battery;
import fan.ENUMS.Radar;
import fan.ENUMS.Status;

public class R4 extends AstromechDroid{
	
	private Status R4Status;
	private Battery R4Battery;
	private Radar R4Radar;
	
	public R4(String serialNumber) {
		super(serialNumber);
		this.R4Status = Status.ONLINE;
		this.R4Battery = Battery.R4;
		this.R4Radar = Radar.R4R;
		this.setChasis(new Chasis(serialNumber));
		this.setDome(new SensorDome(serialNumber));
		this.setLeftArm(new LeftArm(serialNumber));
		this.setRightArm(new RightArm(serialNumber));
		this.setHeight(this.getChasis().getHeight() + this.getDome().getHeight());
		this.setWeight(this.getChasis().getWeight() + this.getDome().getWeight());
	}
	
	
	public void displayDroid() {
		System.out.println("Displaying R4 Droid: " + this.getSerialNumber());
		this.checkStatus();
		System.out.println("      Battery: " + this.getR4Battery().getType() + ", " + this.getR4Battery().getAmps());
		System.out.println("      Radar: " + this.getR4Radar().getType() + ", " + this.getR4Radar().getRange());
		System.out.println("      Height: " + this.getHeight());
		System.out.println("      Weight: " + this.getWeight());
		
		// Chasis check
		if (this.getChasis().chasisCheck()) {
			System.out.println("      Chasis: " + this.getChasis().getStatus());
		} else {
			System.out.println("      Chasis: " + this.getChasis().getStatus());
		}
		
		// Sensor Dome check
		if (this.getDome().sensorDomeCheck()) {
			System.out.println("      Sensor Dome: " + this.getDome().getStatus());
		} else {
			System.out.println("      Sensor Dome: " + this.getDome().getStatus());
		}
		
		// Arm Check
		if (this.getLeftArm().armCheck()) {
			System.out.println("      Left Arm: " + this.getLeftArm().getSerialNumber() + " "  + this.getLeftArm().getStatus());
		} else {
			System.out.println("      Left Arm: " + this.getLeftArm().getSerialNumber() + " "  + this.getLeftArm().getStatus());
		}
		
		if (this.getRightArm().armCheck()) {
			System.out.println("      Right Arm: " + this.getRightArm().getSerialNumber() + " "  + this.getRightArm().getStatus());
		} else {
			System.out.println("      Right Arm: " + this.getRightArm().getSerialNumber() + " "  + this.getRightArm().getStatus());
		}
		
		// Pad Check
		if (this.getLeftArm().getPad().padCheck()) {
			System.out.println("      Left Foot Pad: " + this.getLeftArm().getPad().getSerialNumber() + " " + this.getLeftArm().getPad().getLeftPadStatus());
		} else {
			System.out.println("      Left Foot Pad: " + this.getLeftArm().getPad().getSerialNumber() + " " + this.getLeftArm().getPad().getLeftPadStatus());
		}
		
		if (this.getRightArm().getPad().padCheck()) {
			System.out.println("      Right Foot Pad: " + this.getRightArm().getPad().getSerialNumber() + " " + this.getRightArm().getPad().getRightPadStatus());
		} else {
			System.out.println("      Right Foot Pad: " + this.getRightArm().getPad().getSerialNumber() + " " + this.getRightArm().getPad().getRightPadStatus());
		}
		
		
		
		System.out.println("");
	}
	
	public void checkStatus() {
		if ((this.getChasis().getStatus() == Status.ONLINE) && (this.getDome().getStatus() == Status.ONLINE)
				 && (this.getLeftArm().getStatus() == Status.ONLINE) && (this.getRightArm().getStatus() == Status.ONLINE)) {
			System.out.println("R4 Astromech is ONLINE");
		} else {
			System.out.println("R4 Astromech is OFFLINE");
		}
		
	}

	public Status getR4Status() {
		return R4Status;
	}

	public void setR4Status(Status r4Status) {
		this.R4Status = r4Status;
	}

	public Battery getR4Battery() {
		return R4Battery;
	}

	public void setR4Battery(Battery r4Battery) {
		this.R4Battery = r4Battery;
	}

	public Radar getR4Radar() {
		return R4Radar;
	}

	public void setR4Radar(Radar r4Radar) {
		this.R4Radar = r4Radar;
	}


	
	
	
	
	
	
}
