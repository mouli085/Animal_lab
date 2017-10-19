package animal;

public class Water extends Mammal {

    int age,weight;
    public Water(String n,int age,int weight)
    {
    	super(n);
    	this.age=age;
    	this.weight=weight;
    }
    
	public void tWater() {
	System.out.println("this water section\n");
     }
    
	
}
