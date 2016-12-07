package pokemon.view;

import javax.swing.*;
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
		
	}
}