
public class Animal 
{
	private String name;
	private String breed;
	private int noLegs;
	private boolean domestic;
	private String colour;
	
	// First constructor 
	public Animal(String name) 
	{
		this.name = name;
	}
	
	//Second constructor
	public Animal(String name, String breed, int noLegs, boolean domestic, String colour)
	{
		this.name = name;
		this.breed = breed;
		this.noLegs = noLegs;
		this.domestic = domestic;
		this.colour = colour;
		
	}
	
	public String toString()
	{
		String content = "My name is "+ name + " I am a "+breed + " I have "+noLegs + " I am domestic: "+domestic + " I am "+colour;
		return content;
		
	}
}

