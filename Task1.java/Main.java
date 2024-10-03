//1.b Create an entity class called Team.

	public class Team
{

//1.c Add a private instance variable/attribute to Team to hold the team's name.

	private String teamName;

//1.d Add another private instance variable to hold the team's rank (some number).

	private String teamRank;

//1.e Add yet another private instance variable to hold the names of players in the team.
	
	private String playerNames;

//1.f Add a constructor with a parameter, so that the Team can be instantiated with a team name.
	
	public Team(String teamName)
	
	{
		this.teamName = teamName;


	}

//1.h In the Team class add a method called setRank() that takes a number as parameter and assigns it to the rank attribute.

	public void setTeamRank(String teamRank)
	
	{

		this.teamRank = teamRank;
	}

//1.m Adjust the toString() method so that each playername is a part of the returned String.

	public String toString(){

		return "Hold: " + teamName + ", rang: " + teamRank;
	}

}