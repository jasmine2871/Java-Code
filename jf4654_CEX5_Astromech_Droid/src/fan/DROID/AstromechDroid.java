package fan.DROID;

import fan.ARMS.LeftArm;
import fan.ARMS.RightArm;
import fan.CHASIS.Chasis;
import fan.DOME.SensorDome;
import fan.INTERFACES.Droid;

public abstract class AstromechDroid implements Droid{
	
	private String serialNumber;
	private double height;
	private double weight;
	private SensorDome dome;
	private Chasis chasis;
	private LeftArm leftArm;
	private RightArm rightArm;
	
	
	
	public AstromechDroid(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public abstract void checkStatus();
	
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
	
	public SensorDome getDome() {
		return dome;
	}
	
	public void setDome(SensorDome dome) {
		this.dome = dome;
	}
	
	public Chasis getChasis() {
		return chasis;
	}
	
	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}
	
	public LeftArm getLeftArm() {
		return leftArm;
	}
	
	public void setLeftArm(LeftArm leftArm) {
		this.leftArm = leftArm;
	}
	
	public RightArm getRightArm() {
		return rightArm;
	}
	
	public void setRightArm(RightArm rightArm) {
		this.rightArm = rightArm;
	}
	
	
	
	
}
