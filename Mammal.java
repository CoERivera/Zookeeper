
class Mammal {
	private int energy;
	private int maxEnergy;
	
	public Mammal() {
		energy = maxEnergy = 100;
	}
	
	public Mammal(int maxEnergy) {
		energy = this.maxEnergy = maxEnergy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public int displayEnergy() {
		if(energy > maxEnergy) {
			energy = maxEnergy;
		}
		System.out.printf("Current energy: %d/%d.%n", energy, maxEnergy);
		
		return getEnergy();
	}
}
