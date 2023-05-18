package fan.FACTORY;

import fan.DROID.AstromechDroid;
import fan.INTERFACES.Displayable;

public abstract class DroidFactory implements Displayable{
	
	private String factoryID;
	private AstromechDroid[] droidStorage;
	
	public DroidFactory(String factoryID) {
		this.factoryID = factoryID;
	}
	
	public abstract boolean buildDroids(int count);

	public String getFactoryID() {
		return factoryID;
	}

	public void setFactoryID(String factoryID) {
		this.factoryID = factoryID;
	}

	public AstromechDroid[] getDroidStorage() {
		return droidStorage;
	}

	public void setDroidStorage(AstromechDroid[] droidStorage) {
		this.droidStorage = droidStorage;
	}
	
	
	
	
}
