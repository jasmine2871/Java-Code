package fan.FACTORY;

public abstract class DroidFactory {
	
	private String IDNumber;
	private String BuildType;
	
	public DroidFactory(String IDNumber, String BuildType) {
		this.IDNumber = IDNumber;
		this.BuildType = BuildType;
	}
	
	public void displayInfo() {
		System.out.println("Droid Factory ID: " + this.IDNumber);
		System.out.println("Droid Builds: " + this.BuildType);
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String IDNumber) {
		this.IDNumber = IDNumber;
	}

	public String getBuildType() {
		return BuildType;
	}

	public void setBuildType(String BuildType) {
		this.BuildType = BuildType;
	}
	
	
	
	
}
