package pokemon.model;

public class Charizard extends Pokemon implements Fly, Fire
{
	public Charizard()
	{
		super("Charizard", 6);
	}
	
	public Charizard(String name)
	{
		super(name, 6);
	}
	
	public int fly()
	{
		return 1;
	}
	
	public int hurricane()
	{
		return 1;
	}
	
	public int toast()
	{
		return 1;
	}
	
	public int fieryDance()
	{
		return 1;
	}
}