package fan.TIEFIGHTER;

import fan.INTERFACE.Bombing;
import fan.SUPPORT.Location;
import fan.SUPPORT.TiePilot;
import fan.WEAPON.LaserCannon;
import fan.WEAPON.ProtonBomb;
import fan.WEAPON.TieWeapon;

public class TieFighter_H extends TieFighter implements Bombing{

	public TieFighter_H(String iDNumber, TiePilot pilot) {
		super(iDNumber, pilot);
		this.setManufacturer("Sienar Fleet Systems");
		this.setModel("Tie Heavy Fighter");
		this.setFighterClass("Close Support");
		this.setLength(7.8);
		this.setWidth(8.5);
		this.setHeight(5.0);
		this.setFuelCapacity(375);
		this.setMaxSpeed(850);
		this.setCurrentLocation(new Location(10,12,0));
		this.setWpns(new TieWeapon[]{new LaserCannon("L2"), new LaserCannon("L2"), new ProtonBomb("P1"), 
				new ProtonBomb("P1"), new ProtonBomb("P1"), new ProtonBomb("P1"), new ProtonBomb("P1"), 
				new ProtonBomb("P1"), new ProtonBomb("P1"), new ProtonBomb("P1")});
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

	@Override
	public boolean bombTarget() {
		for (int i = 0; i < this.getWpns().length; i++) {
			if (this.getWpns()[i] instanceof ProtonBomb) {
				if (((ProtonBomb)(this.getWpns()[i])).isDropped() == false) {
					this.getWpns()[i].Fire();
					System.out.println("Bombs Away");
					return true;
				}
			}
		}
		
		System.out.println("Bombs Expended");
		return false;
	}

}
