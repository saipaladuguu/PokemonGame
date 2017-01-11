package pokemon.model;

public class Eevee extends Pokemon implements Normal
{
	public Eevee()
	{
		super("Eevee", 133);
	}
	
	public Eevee(String name)
	{
		super(name, 133);
	}
	
	public int attract()
	{
		return 1;
	}
	
	public int celebrate()
	{
		return 1;
	}
}