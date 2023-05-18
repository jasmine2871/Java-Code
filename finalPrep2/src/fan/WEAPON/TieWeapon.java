package fan.WEAPON;

public abstract class TieWeapon {
	
	private String model;

	public TieWeapon(String model) {
		this.model = model;
	}
	
	public abstract void Fire();

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
	
}
