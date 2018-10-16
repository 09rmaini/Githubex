package com.qa.myblackjack;

public class Blackjack {

	public static void main(String[] args) {
		

	}
	
	public int play(int player, int dealer) {
		//Create functional code
		
		
		
		if (player > 0 && dealer > 0 && player <=31 && player <=31)
		{
			if (player >21 && dealer >21) {
				return 0;
			}
			else if (player <= 21 && dealer >21) {
				return player;
			}
			else if (dealer <=21 && player >21) {
				return dealer;
			}
			else if (player>dealer) {
				return (player > dealer ? player : dealer);  // (? ternary operator) 
				//if player is greater than dealer, return player 
				//  if not, return dealer
			}
			else {
				return dealer;
			}
			
			
			
		}
		else {
			return 0;
		}
		
		
		
		
		
	}

}
