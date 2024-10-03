
//1.a Create a class Main with a main method.

public class Main {
	
	public static void main (String[] args){


		Team Team1 = new Team("FC Pooptown", "1st", "Tess, Thor, Johan");

//1.i From the main method, call the method setRank()

		Team1.setTeamRank("1st");

//1.g In the main method in the Main class, create an instance of the Team class

		Team Team2 = new Team("The Iterators", "2nd", "Players");
		Team2.setTeamRank("2nd");

		Team Team3 = new Team("Cereal Killers", "4th", ", Malene, Mia, Mie");
		Team3.setTeamRank("4th");

		Team Team4 = new Team("IDGAF", "3rd", "Lasse, Jesper, Magnus");
		Team4.setTeamRank("3rd");

		Team Team5 = new Team("Gut Wrenchers", "5th", "Olivia, Rasmus, Styrbjørn");
		Team5.setTeamRank("5th");

//1.j In the Team class add a toString() method that returns a String formated like this:

		System.out.println(Team1.toString());
		System.out.println(Team2.toString());
		System.out.println(Team3.toString());
		System.out.println(Team4.toString());
		System.out.println(Team5.toString());
	}
}