package fan.BODIES;

public class Torso extends Body{
	
	private boolean Operational;
	
	public Torso(String IDNumber) {
		super(IDNumber, "Torso");
		this.Operational = true;
	}

	@Override
	public void displayInfo() {
		System.out.println("Body ID: " + getIDNumber() + " Body Type: " + getBType());
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean Operational) {
		this.Operational = Operational;
	}
	
	

}
