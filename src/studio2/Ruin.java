package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How much money did you start with?: ");
		int startAmount = in.nextInt();
		System.out.println("Win probablility: ");
		double winChance = in.nextDouble();
		System.out.println("Win limit: ");
		int winLimit = in.nextInt();
		System.out.println("Total number of days simulated: ");
		int totalSimulations = in.nextInt();
		int money = startAmount;
		String winStatement = "";
		int playCount = 0;
		int simulationCount = 0;
		for ( money = startAmount; (money == winLimit || money == 0); playCount++)
		{
			simulationCount++;
			boolean winOutcome = Math.random() <= winChance;
			
			if (winOutcome == true)
			{
				money++;

			}
			else
			{
				money--;
				
			}
			
		}
		if (money == winLimit)
			winStatement = "WIN";
		else 
			winStatement = "LOSE"; 
		System.out.println("Simulation " + simulationCount + ": " + startAmount + winStatement);
	}

}
