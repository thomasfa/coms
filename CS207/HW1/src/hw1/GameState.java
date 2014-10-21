package hw1;

/**
 * This class encapsulates the logic and state for a simplified game of American
 * football.
 * 
 * @author YOUR NAME HERE
 */
public class GameState 
{
	/**
	 * Number of points awarded for a touchdown.
	 */
	public static final int TOUCHDOWN_POINTS = 6;

	/**
	 * Number of points awarded for a successful extra point attempt after a
	 * touchdown.
	 */
	public static final int EXTRA_POINTS = 1;

	/**
	 * Number of points awarded for a field goal.
	 */
	public static final int FIELD_GOAL_POINTS = 3;

	/**
	 * Total length of the field from goal line to goal line, in yards.
	 */
	public static final int FIELD_LENGTH = 100;

	/**
	 * Initial position of the offensive team after receiving a kickoff.
	 */
	public static final int STARTING_POSITION = 70;
	private int team0Points = 0;
	private int team1Points = 0;
	private int yardsToDown = 10;
	private int ballAt = 0;
	private int down = 0;
	private int whichTeamOffense = 0;
	private boolean success;

	public GameState() 
	{
		whichTeamOffense = 0;
		ballAt = STARTING_POSITION;
		down = 0;
		team0Points = 0;
		team1Points = 0;
		yardsToDown = 10;
	}

	public int getLocation() 
	{
		return ballAt;
	}

	public int getYardsToFirstDown() 
	{
		return yardsToDown;
	}

	public int getScore(int whichTeam)
	{
		if (whichTeam == 0) 
		{
			return team0Points;
		} 
		else 
		{
			return team1Points;
		}
	}

	public int getDown() 
	{
		if (down > 4) 
		{
			whichTeamOffense = Math.abs(whichTeamOffense - 1);
			down = 1;
			ballAt = FIELD_LENGTH - ballAt;
			return down;
		}
		else
		{
			if (yardsToDown <= 0) 
			{
				down = 1;
				yardsToDown = 10;
				return down;
			}
			else
			{
				down++;
				return down;
			}
		}
	}

	public int getOffense() 
	{
		return whichTeamOffense;
	}

	public void runOrPass(int yards) 
	{	
		if (Math.min(FIELD_LENGTH, Math.max(ballAt - yards, 0)) == 0) 
		{
			if (whichTeamOffense == 0) 
			{
				team0Points += TOUCHDOWN_POINTS;
				extraPoint(success);
			} 
			else 
			{
				team1Points += TOUCHDOWN_POINTS;
				extraPoint(success);
			}
		} 
		else 
		{
			yardsToDown -= yards;
			down = getDown();
			ballAt = Math.min(FIELD_LENGTH, Math.max(ballAt - yards, 0));
		}
	}

	public void extraPoint(boolean success)
	{
		if (success == true) 
		{
			if (whichTeamOffense == 0) 
			{
				team0Points += EXTRA_POINTS;
			} 
			else 
			{
				team1Points += EXTRA_POINTS;
			}
		}
		whichTeamOffense = Math.abs(whichTeamOffense - 1);
		down = 0;
		ballAt = STARTING_POSITION;

	}

	public void fieldGoal(boolean success) 
	{
		if (success == true)
		{
			if (whichTeamOffense == 0) 
			{
				team0Points += FIELD_GOAL_POINTS;
			} 
			else 
			{
				team1Points += FIELD_GOAL_POINTS;
			}
			whichTeamOffense = Math.abs(whichTeamOffense - 1);
			down = 0;
			ballAt = STARTING_POSITION;
		} 
		else 
		{
			whichTeamOffense = Math.abs(whichTeamOffense - 1);
			down = 0;
			ballAt = FIELD_LENGTH - ballAt;
		}

	}

	public void punt(int yards) 
	{
		ballAt = Math.min(FIELD_LENGTH, Math.max(ballAt - yards, 0));
		whichTeamOffense = Math.abs(whichTeamOffense - 1);
		ballAt = FIELD_LENGTH - ballAt;
		down = 0;
		yardsToDown = 10;
	}
}