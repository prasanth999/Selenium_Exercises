package learningjava;
public class Testgame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Football f = new Football();
		f.name="Football";
		f.duration=1;
		f.start(); // // football class
		f.end();
		// features of football
		f.scoreGoal();
		f.goals=1;
		System.out.println("*******************");
		// Parent class
		Game g = new Game();
		g.name="cricket";
		g.duration=10;
		g.start(); // Game class
		g.end();
		
		System.out.println("**********************");
		//parent      child
		// all functions in game class
		// oveeriden in child class are called
		Game g1 = new Football();
		g1.name="golf";
		g1.duration=10;
		g1.start(); // football
		g1.end();// game
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
