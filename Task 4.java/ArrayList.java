
import java.util.ArrayList;

// 4.e - Create a client class, Main with a main method. (You will use this class to test the GameMenu class).

public class Main {
	
	public static void main(String[] args)
	{

// 4.f In the main method create an ArrayList<String> called actions. Don't forget to import the ArrayList class.

		ArrayList<String> actionsMenu = new ArrayList<String>();
		
		actionsMenu.add("Start Game");
		actionsMenu.add("Resume Game");
		actionsMenu.add("Pause Game");
		actionsMenu.add("End Game");

		System.out.println(actionsMenu.get(1));

// 4.g - Instantiate theGameMenu class with the actions list as an argument to the constructor.
		
		GameMenu GameMenu1 = new GameMenu(actionsMenu);
	
// 4.h - In the GameMenu class add a method displayMenu() that prints out the elements of the actions attribute.
		
		GameMenu1.displayMenu();

	}

}