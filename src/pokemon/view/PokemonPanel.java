package pokemon.view;

import javax.swing.*;
<<<<<<< HEAD
import java.awt.Color;
import java.awt.Dimension;
import pokemon.controller.PokemonController;
import java.awt.event.*;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokemonSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		this.updateButton = new JButton("Update the stats!");
		this.nameField = new JTextField(25);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10, 25);
		this.pokemonSelector = new JComboBox(baseController.buildPokedexText());
		this.advancedLabel = new JLabel("Advanced Info");
		this.combatLabel = new JLabel("Combat Points: ");
		this.healthLabel = new JLabel("Health Points: ");
		this.speedLabel = new JLabel("Speed Rate: ");
		this.numberLabel = new JLabel("Pokemon Number: ");
		this.nameLabel = new JLabel("My name is: ");
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.GRAY);
		
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		this.add(pokemonSelector);
		this.add(healthField);
		this.add(healthLabel);
		this.add(combatField);
		this.add(combatLabel);
		this.add(speedField);
		this.add(speedLabel);
		this.add(nameField);
		this.add(nameLabel);
		this.add(numberField);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(advancedArea);
		this.add(pokemonLabel);
		this.add(updateButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 3, SpringLayout.EAST, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, -5, SpringLayout.NORTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 6, SpringLayout.EAST, speedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, -393, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 42, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, -38, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonLabel, -98, SpringLayout.WEST, advancedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, -6, SpringLayout.NORTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -20, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -335, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 6, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 69, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 21, SpringLayout.SOUTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, -6, SpringLayout.NORTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 6, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 103, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 24, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, -6, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 6, SpringLayout.EAST, combatLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 6, SpringLayout.SOUTH, advancedLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -269, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonSelector, 2, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonSelector, 36, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 20, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -103, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, -6, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.SOUTH, updateButton, -54, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -179, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		pokemonSelector.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokemonSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHealthPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation() + "\n\n" + baseController.getPokedex().get(selected).getPokemonTypes());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getPokemonTypes());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
			}
		});
		
		updateButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				if(isValidName(nameField.getText()) && isValidInteger(combatField.getText()) && isValidInteger(healthField.getText()) && isValidDouble(speedField.getText()))
				{
					int selected = pokemonSelector.getSelectedIndex();
					baseController.updateSelected(selected, nameField.getText(), Integer.parseInt(combatField.getText()), Integer.parseInt(healthField.getText()), Double.parseDouble(speedField.getText()));
				}
			}
		});
		
		this.addMouseListener(new MouseListener()
			{
				public void mouseEntered(MouseEvent entered)
				{
//					JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse entered the program.");
				}
				public void mouseReleased(MouseEvent released)
				{
//					System.out.println("released");

				}
				public void mouseExited(MouseEvent exited)
				{
//					JOptionPane.showMessageDialog(baseController.getBaseFrame(), "The mouse exited the program.");
				}
				
				public void mouseClicked(MouseEvent clicked)
				{
//					System.out.println("clicked");
				}
				
				public void mousePressed(MouseEvent pressed)
				{
//					System.out.println("pressed");
				}
			});
		
		this.addMouseMotionListener(new MouseMotionListener()
			{
				public void mouseDragged(MouseEvent dragged)
				{
					//setRandomColor();
				}
				
				public void mouseMoved(MouseEvent moved)
				{
					//if((Math.abs(moved.getX() - updateButton.getX()) < 5) || (Math.abs(moved.getY() - updateButton.getY()) < 5))
					//{
					//	updateButton.setLocation(moved.getX() + 10, moved.getY() - 10);
					//}
				}
			});
	}
	
	private void changeColorBasedOnData(String data)
	{
		if(data.contains("Electric"))
		{
			this.setBackground(Color.YELLOW);
		}
		else if(data.contains("Fly"))
		{
			this.setBackground(Color.CYAN);
		}
		else if(data.contains("Fire"))
		{
			this.setBackground(Color.RED);
		}
		else if(data.contains("Normal"))
		{
			this.setBackground(Color.DARK_GRAY);
		}
		else
		{
			setRandomColor();
		}
		
		repaint();
	}
	
	private void changeImageDisplay(String name)
	{
		String path= "/pokemon/view/images/";
		String defaultName = "pokeball";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		pokemonLabel.setIcon(pokemonIcon);
		repaint();
	}
	
	private boolean isValidDouble(String input)
	{
		boolean isValid = false;
		
		try
		{
			double successful = Double.parseDouble(input);
			isValid = true;
		}
		catch(NumberFormatException userTypedSomething)
		{
			JOptionPane.showMessageDialog(this, "Type in a valid double for speed!");
			speedField.setText("");
		}
		
		return isValid;
	}
	
	private boolean isValidInteger(String input)
	{
		boolean isValid = false;
		
		try
		{
			int successful = Integer.parseInt(input);
			isValid = true;
		}
		catch(NumberFormatException userTypedSomething)
		{
			JOptionPane.showMessageDialog(this, "Type in a valid integer!");
			combatField.setText("");
			healthField.setText("");
		}
		
		return isValid;
	}

	private boolean isValidName(String input)
	{
		boolean isValid = true;
		
		if(nameField.getText().length() <= 2)
		{
			JOptionPane.showMessageDialog(this, "The name is not long enough!");
			isValid = false;
		}
		
		return isValid;
	}
	
	private void setRandomColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
=======
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokemonSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		this.updateButton = new JButton("Update the stats!");
		this.nameField = new JTextField(25);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10, 25);
		this.pokemonSelector = new JComboBox(new String [] {"Charmander", "Pickachu", "Eevee", "Charizard", "Snorlax"});
		this.advancedLabel = new JLabel("Advanced Info");
		this.combatLabel = new JLabel("Combat Points: ");
		this.healthLabel = new JLabel("Health Points: ");
		this.speedLabel = new JLabel("Speed Rate: ");
		this.numberLabel = new JLabel("Pokemon Number: ");
		this.nameLabel = new JLabel("My name is: ");
		this.pokemonLabel = new JLabel("The current pokemon", pokemonIcon, JLabel.CENTER);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.GRAY);
		
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		this.add(pokemonSelector);
		this.add(healthField);
		this.add(healthLabel);
		this.add(combatField);
		this.add(combatLabel);
		this.add(speedField);
		this.add(speedLabel);
		this.add(nameField);
		this.add(nameLabel);
		this.add(numberField);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(advancedArea);
		this.add(pokemonLabel);
		this.add(updateButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, -393, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 42, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, -38, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonLabel, -98, SpringLayout.WEST, advancedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, -6, SpringLayout.NORTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -20, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, -335, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 6, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 69, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 21, SpringLayout.SOUTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 6, SpringLayout.EAST, speedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, -6, SpringLayout.NORTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 6, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 103, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 24, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, -6, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 6, SpringLayout.EAST, combatLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 6, SpringLayout.SOUTH, advancedLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -269, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonSelector, 2, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonSelector, 36, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 20, SpringLayout.SOUTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -103, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, -6, SpringLayout.NORTH, healthField);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, speedField);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 6, SpringLayout.SOUTH, combatField);
		baseLayout.putConstraint(SpringLayout.SOUTH, updateButton, -54, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -179, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
>>>>>>> origin/master
	}
}