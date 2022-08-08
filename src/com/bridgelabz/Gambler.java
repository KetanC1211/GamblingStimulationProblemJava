package com.bridgelabz;

public class Gambler {
	public static final int PLAYER_BALANCE_PER_DAY = 100;
	public static final int BET_AMOUNT_PER_GAME = 1;
	public static final int WON_CURRENT_BET = 1;// Used Switch Case Option
	public static final int LOST_CURRENT_BET = 0;//Used Switch Case Option

	public static void main(String[] args) {
		System.out.println("Welcome Gambling Stimulation Problem");
		int playerCurrentBalance = PLAYER_BALANCE_PER_DAY ;
		
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
		System.out.println("Player Balance at start of day is "+playerCurrentBalance);
	}
}