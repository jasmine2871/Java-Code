package fan.DROID;

import fan.ARMS.LeftArm;
import fan.ARMS.RightArm;
import fan.CHASIS.Chasis;
import fan.DOME.SensorDome;
import fan.ENUMS.Battery;
import fan.ENUMS.Status;

public class R3 extends AstromechDroid {
	
	private Status R3Status;
	private Battery R3Battery;
	
	public R3(String serialNumber) {
		super(serialNumber);
		this.R3Status = Status.ONLINE;
		this.R3Battery = Battery.R3;
		this.setChasis(new Chasis(serialNumber));
		this.setDome(new SensorDome(serialNumber));
		this.setLeftArm(new LeftArm(serialNumber));
		this.setRightArm(new RightArm(serialNumber));
		this.setHeight(this.getChasis().getHeight() + this.getDome().getHeight());
		this.setWeight(this.getChasis().getWeight() + this.getDome().getWeight());
	}
	
	@Override
	public void displayDroid() {
		System.out.println("Displaying R3 Droid: " + this.getSerialNumber());
		this.checkStatus();
		System.out.println("      Battery: " + this.getR3Battery().getType() + ", " + this.getR3Battery().getAmps());
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
	
	@Override
	public void checkStatus() {
		if ((this.getChasis().getStatus() == Status.ONLINE) && (this.getDome().getStatus() == Status.ONLINE)
				 && (this.getLeftArm().getStatus() == Status.ONLINE) && (this.getRightArm().getStatus() == Status.ONLINE)) {
			System.out.println("R3 Astromech is ONLINE");
		} else {
			System.out.println("R3 Astromech is OFFLINE");
		}
	}
	
	public Status getR3Status() {
		return R3Status;
	}

	public void setR3Status(Status r3Status) {
		this.R3Status = r3Status;
	}

	public Battery getR3Battery() {
		return R3Battery;
	}

	public void setR3Battery(Battery r3Battery) {
		this.R3Battery = r3Battery;
	}
	
	
	
}
