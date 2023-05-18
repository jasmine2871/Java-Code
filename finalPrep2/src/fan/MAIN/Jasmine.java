package fan.MAIN;

import fan.SUPPORT.TiePilot;
import fan.TIEFIGHTER.TieFighter_S;
import fan.TIEFIGHTER.TieFighter_H;

public class Jasmine {

	public static void main(String[] args) {
		TiePilot SP1 = new TiePilot("SP-001", "LT", "Veteran");
		TiePilot HP1 = new TiePilot("SP-002", "CAPT", "Elite");
		TieFighter_S ts = new TieFighter_S("ITS-001", SP1);
		TieFighter_H th = new TieFighter_H("ITH-101", HP1);
		
		ts.displayFighterData();
		System.out.println();
		th.displayFighterData();
		System.out.println();
		ts.firesCannons();
		System.out.println();
		th.bombTarget();
		System.out.println();
		ts.getPilot().displayInfo();
		System.out.println();
		th.getPilot().displayInfo();
		
		System.out.println();
		System.out.print(ts.getCurrentLocation().toString());
		System.out.println();
		System.out.print(th.getCurrentLocation().toString());
		
		th.Takeoff();
		ts.Takeoff();
		System.out.println();
		System.out.print(ts.getCurrentLocation().toString());
		System.out.println();
		System.out.print(th.getCurrentLocation().toString());

	}

}
