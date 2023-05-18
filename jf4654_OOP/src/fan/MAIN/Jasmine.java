package fan.MAIN;

import fan.IMPERIAL.Polymer;


public class Jasmine {

	public static void main(String[] args) {
		Polymer[] pList = new Polymer[1000];
		for(int i = 0; i < 1000; i++) {
			pList[i] = new Polymer();
		}
		
		pList[342].displayPolymer();
		System.out.println();
		pList[123].getMolecules()[2].displayMolecule();
		System.out.println();
		pList[23].getMolecules()[1].getAtoms()[3].displayAtom();
		System.out.println(); 
		pList[713].getMolecules()[1].getAtoms()[1].getParticles()[1].displayParticle();
		
	}

}
