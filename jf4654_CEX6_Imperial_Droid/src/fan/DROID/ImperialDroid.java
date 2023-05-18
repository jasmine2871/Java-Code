package fan.DROID;

import java.util.TreeMap;

import fan.ARMS.Arm;
import fan.ARMS.LeftArm;
import fan.ARMS.RightArm;
import fan.BODIES.Cranial;
import fan.BODIES.Torso;
import fan.INTERFACES.DroidActions;
import fan.INTERFACES.DroidOperations;
import fan.LEGS.LeftLeg;
import fan.LEGS.Leg;
import fan.LEGS.RightLeg;

public abstract class ImperialDroid implements DroidActions, DroidOperations{
	
	private String DroidID;
	private String DroidType;
	private Cranial Head;
	private Torso UpperTorso;
	private TreeMap<String, Arm> Arms;
	private TreeMap<String, Leg> Legs;
	
	public ImperialDroid(String DroidID, String DroidType) {
		this.DroidID = DroidID;
		this.DroidType = DroidType;
		this.Head = new Cranial("x");
		this.UpperTorso = new Torso("x");
		this.Arms = new TreeMap<>();
		this.Legs = new TreeMap<>();
		this.Arms.put("Left Arm", new LeftArm("x"));
		this.Arms.put("Right Arm", new RightArm("x"));
		this.Legs.put("Left Leg", new LeftLeg("x"));
		this.Legs.put("Right Leg", new RightLeg("x"));
	}

	public void displayInfo() {
		System.out.println("Droid ID: " + this.DroidID);
		System.out.println("Droid Type: " + this.DroidType);
		System.out.println("******");
	}
	
	public void runDiagnostic() {
		displayInfo();
		
		if ((this.getHead().isOperational() == true) && (this.getUpperTorso().isOperational() == true) &&
				((((LeftArm)(this.getArms().get("Left Arm"))).isOperational()) == true) && 
				((((RightArm)(this.getArms().get("Right Arm"))).isOperational()) == true) &&
				((((LeftLeg)(this.getLegs().get("Left Leg"))).isOperational()) == true) &&
				((((RightLeg)(this.getLegs().get("Right Leg"))).isOperational()) == true)) {
			System.out.println("Droid Operating Within Normal Parameters");
		} else {
			System.out.println("Droid has Malfunctioning Component(s)");
		}
		
		System.out.println("               Component Status");
		
		if (this.getHead().isOperational() == true) {
			System.out.println("HEAD Check: Head Normal");
		} else {
			System.out.println("HEAD Check: Head ERROR!!");
		}
		
		
		if (this.getUpperTorso().isOperational() == true) {
			System.out.println("UPPER TORSO Check: Upper Torso Normal");
		} else {
			System.out.println("UPPER TORSO Check: Upper Torso ERROR!!");
		}
		
		
		if ((((LeftArm)(this.getArms().get("Left Arm"))).isOperational()) == true) {
			System.out.print("ARMS Check: Left Arm Normal");
		} else {
			System.out.print("ARMS Check: Left Arm ERROR!!");
		}
		
		if ((((RightArm)(this.getArms().get("Right Arm"))).isOperational()) == true) {
			System.out.print(" Right Arm Normal");
			System.out.println();
		} else {
			System.out.print(" Right Arm ERROR!!");
			System.out.println();
		}
		
		
		if ((((LeftLeg)(this.getLegs().get("Left Leg"))).isOperational()) == true) {
			System.out.print("LEGS Check: Left Leg Normal");
		} else {
			System.out.print("LEGS Check: Left Leg ERROR!!");
		}
		
		if ((((RightLeg)(this.getLegs().get("Right Leg"))).isOperational()) == true) {
			System.out.print(" Right Leg Normal");
		} else {
			System.out.print(" Right Leg ERROR!!");
		}

	}
	
	public String getDroidID() {
		return DroidID;
	}

	public void setDroidID(String droidID) {
		this.DroidID = droidID;
	}

	public String getDroidType() {
		return DroidType;
	}

	public void setDroidType(String droidType) {
		this.DroidType = droidType;
	}

	public Cranial getHead() {
		return Head;
	}

	public void setHead(Cranial head) {
		this.Head = head;
	}

	public Torso getUpperTorso() {
		return UpperTorso;
	}

	public void setUpperTorso(Torso upperTorso) {
		this.UpperTorso = upperTorso;
	}

	public TreeMap<String, Arm> getArms() {
		return Arms;
	}

	public void setArms(TreeMap<String, Arm> arms) {
		this.Arms = arms;
	}

	public TreeMap<String, Leg> getLegs() {
		return Legs;
	}

	public void setLegs(TreeMap<String, Leg> legs) {
		this.Legs = legs;
	}
	
	
	
	
	
	
}
