package fan.IMPERIAL;

public class Molecule{
	
	private String id;
	private int size;
	private int mass;
	private Atom[] atoms;
	public static int moleculeCount = 0;
	
	public Molecule() {
		this.id = "MOL-" + moleculeCount;
		moleculeCount++;
		this.atoms = new Atom[4];
		for (int i = 0; i < atoms.length; i++) {
			atoms[i] = new Atom();
			this.size += atoms[i].getSize();
			this.mass += atoms[i].getMass();
		}
	}
	

	public void displayMolecule() {
		System.out.printf("%-27s%-27s%-27s", "Molecule: " + this.id, "Size: " + this.size, "Mass: " + this.mass);
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

	public Atom[] getAtoms() {
		return atoms;
	}

	public void setAtoms(Atom[] atoms) {
		this.atoms = atoms;
	}
	
	
	
}
