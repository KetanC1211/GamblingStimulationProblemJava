package com.bridgelabz;

public class Gambler {
	public static final int PLAYER_BALANCE_PER_DAY = 100;
	public static final int BET_AMOUNT_PER_GAME = 1;
	public static final int WON_CURRENT_BET = 1;// Used Switch Case Option
	public static final int LOST_CURRENT_BET = 0;//Used Switch Case Option
	public static final int NUM_OF_DAY_PLAYED_IN_MONTH = 20;

	public static void main(String[] args) {
		System.out.println("Welcome Gambling Stimulation Problem");
		int investedAmount = NUM_OF_DAY_PLAYED_IN_MONTH*PLAYER_BALANCE_PER_DAY;
		int totalEarnedOrLost = 0;
		int day = 1;
		int profitdays = 0;
		int lossdays = 0;
		while(day<=NUM_OF_DAY_PLAYED_IN_MONTH ) {
			int playerCurrentBalance = PLAYER_BALANCE_PER_DAY ;
			//System.out.println("Day "+day);	
			while(playerCurrentBalance>50&&playerCurrentBalance<150) {
				//Choice value 0 means lost current game , 1 means won current bet
				int choice = (int)(Math.random()*10 %2);
				switch(choice){
					case WON_CURRENT_BET:
						playerCurrentBalance++;
						break;
					case LOST_CURRENT_BET:
						playerCurrentBalance--;
						break;
				}
				//System.out.println(playerCurrentBalance);
			}
			if(playerCurrentBalance==50) {
				lossdays++;
			}
			else {
				profitdays++;
			}
			totalEarnedOrLost = totalEarnedOrLost + playerCurrentBalance;
			System.out.println("Day "+day+"  Balance "+playerCurrentBalance);
			day++;
		}
		System.out.println("In this month you won for "+profitdays+" days and lost for "+lossdays);		
		//Display Monthly Earnings
		if(investedAmount<=totalEarnedOrLost) {
			int profit = totalEarnedOrLost - investedAmount;
			System.out.println("You earned "+profit+" in this month");
		}
		//Display Monthly Loss
		if(investedAmount>totalEarnedOrLost) {
			int loss = investedAmount - totalEarnedOrLost;
			System.out.println("You lost "+loss+" in this month");
		}
	}
}