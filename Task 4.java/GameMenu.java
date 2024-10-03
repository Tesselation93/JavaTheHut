
import java.util.ArrayList;

// 4.a - Create an entity class called GameMenu.

public class GameMenu

{	

// 4.b - Add a private instance variable actions with the type ArrayList<String> to the class.
	
	private ArrayList<String> actions;

// 4.d - In the GameMenu contructor, assign the list received as an argument to the instance variable actions.

	public GameMenu(ArrayList<String> actions)

	{
		this.actions = actions;	
	}
	
	// Add method diplayMenu to print out actionsMenu attributes
	
	public void displayMenu()
	{
		for(String s : actions)
		{
			System.out.println(s);
		}
	}

}