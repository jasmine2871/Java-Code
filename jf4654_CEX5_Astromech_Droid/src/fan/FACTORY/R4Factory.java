package fan.FACTORY;

import fan.DROID.AstromechDroid;
import fan.DROID.R4;

public class R4Factory extends DroidFactory{
	
	public R4Factory(String factoryID) {
		super(factoryID);
	}
	
	public boolean buildDroids(int count) {
		AstromechDroid[] temp = new AstromechDroid[count];
		for (int i = 0; i < count; i++) {
			temp[i] = new R4("R4-" + String.format("%03d", i));
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
