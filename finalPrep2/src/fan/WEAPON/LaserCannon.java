package fan.WEAPON;

public class LaserCannon extends TieWeapon{

	private int maxRange;
	private int ammoCapacity;
	private int currentAmmoCount;
	
	public LaserCannon(String model) {
		super(model);
		this.setMaxRange(1000);
		this.setAmmoCapacity(500);
		this.setCurrentAmmoCount(500);
	}
	
	@Override
	public void Fire() {
		if (this.getCurrentAmmoCount() > 0) {
			this.setCurrentAmmoCount(this.getCurrentAmmoCount() - 1);
			System.out.println("Firing Cannon to the console");
		} else {
			System.out.println("Ammunition Expended");
		}
		
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getAmmoCapacity() {
		return ammoCapacity;
	}

	public void setAmmoCapacity(int ammoCapacity) {
		this.ammoCapacity = ammoCapacity;
	}

	public int getCurrentAmmoCount() {
		return currentAmmoCount;
	}

	public void setCurrentAmmoCount(int currentAmmoCount) {
		this.currentAmmoCount = currentAmmoCount;
	}



	
	
	
	
	
}
