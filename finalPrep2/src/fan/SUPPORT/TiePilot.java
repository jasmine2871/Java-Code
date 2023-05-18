package fan.SUPPORT;

public class TiePilot {
	
	private String IDNumber;
	private String rank;
	private String pilotRating;
	
	public TiePilot(String iDNumber, String rank, String pilotRating) {
		this.IDNumber = iDNumber;
		this.rank = rank;
		this.pilotRating = pilotRating;
	}
	
	public void displayInfo() {
		System.out.println("Imperial Pilot**********");
		System.out.println("ID: " + this.IDNumber);
		System.out.println("RANK: " + this.rank);
		System.out.println("RATING: " + this.pilotRating);
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		this.IDNumber = iDNumber;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPilotRating() {
		return pilotRating;
	}

	public void setPilotRating(String pilotRating) {
		this.pilotRating = pilotRating;
	}
	
	
	
	
	
}
