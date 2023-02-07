
class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		System.out.println("The gorilla threw something!");
		super.setEnergy(super.getEnergy()-5);
		super.displayEnergy();
	}
	
	public void eatBananas() {
		System.out.println("The gorilla ate a bunch of bananas!");
		super.setEnergy(super.getEnergy()+10);
		super.displayEnergy();
	}
	
	public void climb() {
		System.out.println("The gorilla climbed a tree!");
		super.setEnergy(super.getEnergy()-10);
		super.displayEnergy();
	}
}
