package fan.FACTORY;

import fan.DROID.AstromechDroid;
import fan.DROID.R3;

public class R3Factory extends DroidFactory{

	public R3Factory(String factoryID) {
		super(factoryID);
	}
	
	public boolean buildDroids(int count) {
		AstromechDroid[] temp = new AstromechDroid[count];
		for (int i = 0; i < count; i++) {
			temp[i] = new R3("R3-" + String.format("%03d", i));
		}
		this.setDroidStorage(temp);
		return true;
	}
	
	public void displayAllDroids() {
		for (int i = 0; i < this.getDroidStorage().length; i++) {
			this.getDroidStorage()[i].displayDroid();
		}
	}

	
	
}
