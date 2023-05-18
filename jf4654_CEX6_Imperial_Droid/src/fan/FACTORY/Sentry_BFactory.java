package fan.FACTORY;

import java.util.TreeMap;
import fan.DROID.SentryDroid_B;

public class Sentry_BFactory extends DroidFactory{

	public static int BuildCount = 0;
	
	public Sentry_BFactory(String IDNumber) {
		super(IDNumber, "Beta Droids");
	}
	
	public TreeMap<String, SentryDroid_B> buildDroids_B(int count) {
		
		TreeMap<String, SentryDroid_B> tempMap = new TreeMap<>();
		String droidID;
		
		for (int i = 0; i < count; i++) {
			BuildCount += 1;
			droidID = "B" + BuildCount;
			tempMap.put(droidID, new SentryDroid_B(droidID));
			
		}
		return tempMap;
	}
}
