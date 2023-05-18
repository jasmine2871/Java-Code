package fan.LEGS;

public class RightLeg extends Leg{
	
	private boolean Operational;

	public RightLeg(String IDNumber) {
		super("x", "Right Leg");
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
