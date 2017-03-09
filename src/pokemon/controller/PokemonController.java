package pokemon.controller;

import java.util.ArrayList;
<<<<<<< HEAD
import pokemon.model.*;
import pokemon.view.PokemonFrame;
import javax.swing.JOptionPane;

=======

import pokemon.model.Pokemon;
import pokemon.view.PokemonFrame;

>>>>>>> origin/master
public class PokemonController
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		baseFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
<<<<<<< HEAD
		JOptionPane.showMessageDialog(baseFrame, "Welcome to Pokemon Inheritance");
=======
		
>>>>>>> origin/master
	}
	
	private void buildPokedex()
	{
<<<<<<< HEAD
		pokedex.add(new Charizard("Charizard"));
		pokedex.add(new Charmander("Charmander"));
		pokedex.add(new Eevee("Eevee"));
		pokedex.add(new Pikachu("Pikachu"));
		pokedex.add(new Snorlax("Snorlax"));
		pokedex.add(new Snorlax("Snorlax 2.0"));
=======
		
>>>>>>> origin/master
	}
	
	public String[] buildPokedexText()
	{
		String [] pokemonNames = new String[pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		
		return pokemonNames;
	}
<<<<<<< HEAD

	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setSpeed(speed);
		current.setHealthPoints(health);
	}

	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public PokemonFrame getBaseFrame()
	{
		return baseFrame;
	}
}
=======
}
>>>>>>> origin/master
