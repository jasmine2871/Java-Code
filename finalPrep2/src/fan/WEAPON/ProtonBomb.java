package fan.WEAPON;

public class ProtonBomb extends TieWeapon{

	private int yield;
	private boolean dropped;
	
	public ProtonBomb(String model) {
		super(model);
		this.setYield(7);
		this.setDropped(false);
		
	}

	@Override
	public void Fire() {
		this.setDropped(true);
	}
	
	public int getYield() {
		return yield;
	}

	public void setYield(int yield) {
		this.yield = yield;
	}

	public boolean isDropped() {
		return dropped;
	}

	public void setDropped(boolean dropped) {
		this.dropped = dropped;
	}

	
	
	

	
	
}
