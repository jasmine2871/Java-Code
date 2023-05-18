package fan.DROID;

public class SentryDroid_A extends ImperialDroid{
	
	public SentryDroid_A(String DroidID) {
		super(DroidID, "Alpha");
	}

	public void displaySDA() {
		runDiagnostic();
	}
	
}
