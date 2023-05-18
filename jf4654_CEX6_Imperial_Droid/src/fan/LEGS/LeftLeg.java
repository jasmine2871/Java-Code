package fan.LEGS;

public class LeftLeg extends Leg{
	
	private boolean Operational;

	public LeftLeg(String IDNumber) {
		super("x", "Left Leg");
		this.Operational = true;
	}

	@Override
	public void displayInfo() {
		System.out.println("Leg ID: " + getIDNumber() + " Leg Type: " + getLType());
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean Operational) {
		this.Operational = Operational;
	}
	
	
	
	

}
