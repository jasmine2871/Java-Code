package fan.IMPERIAL;

public class Atom{
	
	private String id;
	private int size;
	private int mass;
	private Particle[] particles;
	public static int atomCount = 0;

	public Atom() {
		this.id = "ATM-" + atomCount;
		atomCount++;
		this.particles = new Particle[2];
		for (int i = 0; i < particles.length; i++) {
			particles[i] = new Particle();
			this.size += particles[i].getSize();
			this.mass += particles[i].getMass();
		}
	}
	
	public void displayAtom() {
		System.out.printf("%-27s%-27s%-27s", "Atom: " + this.id, "Size: " + this.size, "Mass: " + this.mass);
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

	public Particle[] getParticles() {
		return particles;
	}

	public void setParticles(Particle[] particles) {
		this.particles = particles;
	}
	
	
	
}
