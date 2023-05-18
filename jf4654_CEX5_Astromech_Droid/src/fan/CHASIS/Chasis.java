package fan.CHASIS;

import fan.ENUMS.Status;

public class Chasis {
	
	private String serialNumber;
	private double height;
	private double weight;
	private Status status;
	
	public Chasis(String serialNumber) {
		this.status = Status.ONLINE;
		this.serialNumber = serialNumber;
		if (this.serialNumber.startsWith("R3")) {
			this.height = 4;
			this.weight = 400;
		} else {
			this.height = 5;
			this.weight = 500;
		}
		
	}
	
	public boolean chasisCheck() {
		if (this.status == Status.ONLINE) {
			return true;
		}
		return false;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
