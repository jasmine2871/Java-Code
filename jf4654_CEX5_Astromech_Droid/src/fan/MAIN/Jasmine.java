package fan.MAIN;

import fan.ENUMS.Status;
import fan.FACTORY.R3Factory;
import fan.FACTORY.R4Factory;

public class Jasmine {

	public static void main(String[] args) {
		System.out.println("---------------------- R3 Droids -------------------------");
		R3Factory r3 = new R3Factory("R3");
		r3.buildDroids(5);
		r3.displayAllDroids();
		
		System.out.println("*********** R3 Droid " + r3.getDroidStorage()[4].getSerialNumber() + " is attacked ************");
		r3.getDroidStorage()[4].getLeftArm().getPad().setLeftPadStatus(Status.OFFLINE);
		r3.getDroidStorage()[4].getRightArm().setStatus(Status.OFFLINE);
		r3.getDroidStorage()[4].displayDroid();
		
		System.out.println(); System.out.println(); System.out.println();
		
		
		System.out.println("---------------------- R4 Droids -------------------------");
		R4Factory r4 = new R4Factory("R4");
		r4.buildDroids(5);
		r4.displayAllDroids();
		
		System.out.println("*********** R4 Droid " + r4.getDroidStorage()[2].getSerialNumber() + " is attacked ************");
		r4.getDroidStorage()[2].getChasis().setStatus(Status.OFFLINE);
		r4.getDroidStorage()[2].getDome().setStatus(Status.OFFLINE);
		r4.getDroidStorage()[2].displayDroid();

	}

}
