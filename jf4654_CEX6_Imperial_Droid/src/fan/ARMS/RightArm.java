package fan.ARMS;

public class RightArm extends Arm{

	private boolean Operational;
	
	public RightArm(String IDNumber) {
		super(IDNumber, "Right Arm");
		this.Operational = true;
	}
	
	public void displayInfo() {
		System.out.println("Arm ID: " + this.getIDNumber() + " Arm Type: " + this.getAType());
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean Operational) {
		this.Operational = Operational;
	}
	 
	
}
