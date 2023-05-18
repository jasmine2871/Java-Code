package fan.ARMS;

public class LeftArm extends Arm{
	
	private boolean Operational;
	
	public LeftArm(String IDNumber) {
		super(IDNumber, "Left Arm");
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
