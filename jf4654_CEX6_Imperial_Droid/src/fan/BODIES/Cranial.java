package fan.BODIES;

public class Cranial extends Body{

	private boolean Operational;
	
	public Cranial(String IDNumber) {
		super(IDNumber, "Cranial");
		this.Operational = true;
	}

	@Override
	public void displayInfo() {
		System.out.println("Body ID: " + this.getIDNumber() + " Body Type: " + this.getBType());
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean Operational) {
		this.Operational = Operational;
	}
	
	
	
}
