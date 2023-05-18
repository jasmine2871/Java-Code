package fan.IMPERIAL;

public class Particle{
	
	private String id;
	private int size;
	private int mass;
	public static int particleCount = 0;
	
	public Particle() {
		this.size = 2;
		this.mass = 4;
		this.id = "Part-" + particleCount;
		particleCount++;
	}
	
	
	public void displayParticle() {
		System.out.printf("%-27s%-27s%-27s", "Particle: " + this.id, "Size: " + this.size, "Mass: " + this.mass);
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
		return particleCount;
	}

	public static void setParticleCount(int particleCount) {
		Particle.particleCount = particleCount;
	}
	
	
	
}
