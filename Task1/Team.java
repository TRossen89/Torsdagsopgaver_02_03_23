import java.util.ArrayList;

class Team {
	

	private String teamName; 

	private int teamRank;

	private ArrayList<String> memberNames; 




	public Team(String teamName) {


		this.teamName = teamName;

	}






	public void setRank (int rankOfTeam) {


		this.teamRank = rankOfTeam;

	}



	public int getRank() {

		

		return this.teamRank;

	}


	public String getTeamName() {


		return this.teamName;

	}





	public String toString() {


		String s = "--- Team: " + getTeamName() + " Rank: " + getRank();

		return s;


	}


}