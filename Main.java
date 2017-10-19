package animal;

public class Main {

	public static void main(String[] args) {
	
		Mammal mammal=new Mammal("mammal");
		
        Animal animal1=new Animal();
		animal1=mammal;
		mammal.tMammal();
		mammal.canMove("mammal");
		
        Land cow=new Land("cow",9,57);
        Animal animal2=new Animal();
        animal2=cow;
		cow.tLand();
		cow.canMove("cow");
		
		Water water=new Water("whale",90,670);
        Animal animal3=new Animal();
        animal3=water;
		water.tWater();
		water.canMove("whale");
		
		Oviparous ovi=new Oviparous();
		Animal animal4=new Animal();
		animal4=ovi;
		ovi.tOvi();
		ovi.canMove("oviparous");
		
		Birds bird=new Birds();
		Animal animal5=new Animal();
		animal5=bird;
		bird.tBirds();
		bird.canMove("crow");
		
		Ants ant= new Ants();
		Animal animal6=new Animal();
		animal6=ant;
		ant.tAnts();
		ant.canMove("ant");
		
		
		
		
	}

}
