package pokemon.model;

public class Snorlax extends Pokemon implements Normal
{
	public Snorlax()
	{
		super("Snorlax", 143);
	}
	
	public Snorlax(String name)
	{
		super(name, 143);
	}
	
	public int attract()
	{
		return 1;
	}
	
	public int celebrate()
	{
		return 5;
	}
}
