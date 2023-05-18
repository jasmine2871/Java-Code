package fan.FACTORY;

import java.util.TreeMap;
import fan.DROID.SentryDroid_A;

public class Sentry_AFactory extends DroidFactory{

	public static int BuildCount = 0;
	
	public Sentry_AFactory(String IDNumber) {
		super(IDNumber, "Alpha Droids");
	}
	
	public TreeMap<String, SentryDroid_A> buildDroids_A(int count) {
		
		TreeMap<String, SentryDroid_A> tempMap = new TreeMap<>();
		String droidID;
		
		for (int i = 0; i < count; i++) {
			BuildCount += 1;
			droidID = "A" + BuildCount;
			tempMap.put(droidID, new SentryDroid_A(droidID));
			
		}
		return tempMap;
	}

	
	 
}
