package fan.TIEFIGHTER;

import fan.SUPPORT.Location;
import fan.SUPPORT.TiePilot;
import fan.WEAPON.LaserCannon;
import fan.WEAPON.TieWeapon;

public class TieFighter_S extends TieFighter{

	public TieFighter_S(String iDNumber, TiePilot pilot) {
		super(iDNumber, pilot);
		this.setManufacturer("Sienar Fleet Systems");
		this.setModel("Tie Standard");
		this.setFighterClass("Superiority");
		this.setLength(6.3);
		this.setWidth(6.4);
		this.setHeight(7.5);
		this.setFuelCapacity(200);
		this.setMaxSpeed(1200);
		this.setCurrentLocation(new Location(10,12,0));
		this.setWpns(new TieWeapon[]{new LaserCannon("L1"), new LaserCannon("L1")});
	}

	
	@Override
	public void MoveLeft() {
		this.getCurrentLocation().setX(this.getCurrentLocation().getX() - 1);
	}

	@Override
	public void MoveRight() {
		this.getCurrentLocation().setX(this.getCurrentLocation().getX() + 1);
		
	}

	@Override
	public void MoveForward() {
		this.getCurrentLocation().setY(this.getCurrentLocation().getY() + 1);
		
	}

	@Override
	public void MoveBackward() {
		this.getCurrentLocation().setY(this.getCurrentLocation().getY() - 1);
		
	}

	@Override
	public void Ascend() {
		this.getCurrentLocation().setZ(this.getCurrentLocation().getZ() + 1);
		
	}

	@Override
	public void Descend() {
		this.getCurrentLocation().setZ(this.getCurrentLocation().getZ() + 1);
		
	}

	@Override
	public void Land() {
		this.getCurrentLocation().setZ(0);
		this.setLanded(true);
		this.setSpaceborne(false);
		
	}

	@Override
	public void Takeoff() {
		this.getCurrentLocation().setZ(10);
		this.setLanded(false);
		this.setSpaceborne(true);
	}

	@Override
	public void scanTarget() {
		System.out.println(this.getIDNumber() + " is scanning for targets");
	}

	@Override
	public void firesCannons() {
		this.getWpns()[0].Fire();
		this.getWpns()[1].Fire();
	}
	
	
	
	
	
}
