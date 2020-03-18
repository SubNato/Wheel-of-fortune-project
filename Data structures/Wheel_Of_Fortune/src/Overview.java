
public class Overview {

	
	
	private String PlayerName;
	private int Playernum;
	private int Total;
	private int Round;
	private String Category;
	private String puzzle;
	private int Attempt;
	private int RoundTotal;
	
	
	
	
	
	
	
	public Overview(String playerName, int playernum, int total, int round, String category, String puzzle, int attempt,
			int roundTotal) {
		super();
		PlayerName = playerName;
		Playernum = playernum;
		Total = total;
		Round = round;
		Category = category;
		this.puzzle = puzzle;
		Attempt = attempt;
		RoundTotal = roundTotal;
	}







	public Overview() {
		super();
	}







	public String getPlayerName() {
		return PlayerName;
	}







	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}







	public int getPlayernum() {
		return Playernum;
	}







	public void setPlayernum(int playernum) {
		Playernum = playernum;
	}







	public int getTotal() {
		return Total;
	}







	public void setTotal(int total) {
		Total = total;
	}







	public int getRound() {
		return Round;
	}







	public void setRound(int round) {
		Round = round;
	}







	public String getCategory() {
		return Category;
	}







	public void setCategory(String category) {
		Category = category;
	}







	public String getPuzzle() {
		return puzzle;
	}







	public void setPuzzle(String puzzle) {
		this.puzzle = puzzle;
	}







	public int getAttempt() {
		return Attempt;
	}







	public void setAttempt(int attempt) {
		Attempt = attempt;
	}







	public int getRoundTotal() {
		return RoundTotal;
	}







	public void setRoundTotal(int roundTotal) {
		RoundTotal = roundTotal;
	}




	public void display()
	{
		System.out.println("Display");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
