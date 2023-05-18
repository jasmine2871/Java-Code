package fan.IMPERIAL;

public class Polymer {
	
	private String id;
	private int size;
	private int mass;
	private Molecule[] molecules;
	private static int polymerCount = 0; 
	
	public Polymer() {	
		this.id = "PLY_" + polymerCount;
		polymerCount++;
		this.molecules = new Molecule[3];
		for (int i = 0; i < molecules.length; i++) {
			molecules[i] = new Molecule();
			this.size += molecules[i].getSize();
			this.mass += molecules[i].getMass();
		}
	}
	
	public void displayPolymer() {
		System.out.printf("%-27s%-27s%-27s", "Polymer: " + this.id, "Size: " + this.size, "Mass: " + this.mass);
		System.out.println();
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public static int getParticleCount() {
		return polymerCount;
	}

	public static void setParticleCount(int polymerCount) {
		Polymer.polymerCount = polymerCount;
	}

	public Molecule[] getMolecules() {
		return molecules;
	}
	
	public void setMolecules(Molecule[] molecules) {
		this.molecules = molecules;
	}
	
}
