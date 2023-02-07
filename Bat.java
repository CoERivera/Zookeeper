
class Bat extends Mammal {
	public Bat() {
		super(300);
	}
	
	public void fly() {
		System.out.println("The bat flaps its wings and takes off...");
		super.setEnergy(super.getEnergy()-50);
		super.displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("The bat ate something and recovered energy!\nIt definitely wasn't humans...");
		super.setEnergy(super.getEnergy()+25);
		super.displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("The bat roleplays as a norse viking and sets a town on fire.");
		super.setEnergy(super.getEnergy()-100);
		super.displayEnergy();
	}
}
