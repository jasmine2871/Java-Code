package fan.FACTORY;

import java.util.TreeMap;
import fan.DROID.SentryDroid_C;

public class Sentry_CFactory extends DroidFactory{

	public static int BuildCount = 0;
	
	public Sentry_CFactory(String IDNumber) {
		super(IDNumber, "Gamma Droids");
	}
	
	public TreeMap<String, SentryDroid_C> buildDroids_B(int count) {
		
		TreeMap<String, SentryDroid_C> tempMap = new TreeMap<>();
		String droidID;
		
		for (int i = 0; i < count; i++) {
			BuildCount += 1;
			droidID = "C" + BuildCount;
			tempMap.put(droidID, new SentryDroid_C(droidID));
			
		}
		return tempMap;
	}
}
