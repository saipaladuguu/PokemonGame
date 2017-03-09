package pokemon.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import pokemon.controller.PokemonController;

public class PokemonFrame extends JFrame
{
	private PokemonController baseController;
	private PokemonPanel appPanel;
	
	public PokemonFrame(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new PokemonPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
<<<<<<< HEAD
		this.setTitle("Pokemon");
		this.setSize(new Dimension(900, 600));
		this.setVisible(true);
	}
}
=======
		this.setTitle("POKEMON");
		this.setSize(new Dimension(900, 600));
		this.setVisible(true);
	}
>>>>>>> origin/master
