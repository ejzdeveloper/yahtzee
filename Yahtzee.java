import java.util.Arrays;

public class Yahtzee {

	public static int  yahtzee(int [] dice, String category) {
		int total = 0;
		//int counter = 0;

		if(category.equals("ones")) {
			for(int i = 0; i < 5; i++) {
				if (dice[i]== 1) {
					total += 1;
				}
			}
						
		}else if(category.equals("twos")) {
			for(int i = 0; i < 5; i++) {
				if (dice[i]== 1) {
					total += 2;
				}
			}
						
		}else if(category .equals("pairs")) {
			Arrays.sort(dice);
			int counter2 = 1;
			for (int i = dice.length - 1; i > 0; i--) {
				if(dice[i]==dice[i-1]) {
					counter2++;
				}
				if(dice[i]!=dice[i-1]) {
					if(counter2==2) {
						total = dice[i] *2;
					}
					else {
						counter2=1;
					}
				}
			}		
		}else if(category.equals("twopairs")) {
			Arrays.sort(dice);
			int counter3 = 1;
			int pairCount = 0;
			int pairPosition1 = 0;
			int pairPosition2 = 0;
			for (int i = dice.length - 1; i > 0; i--) {
				if(dice[i]==dice[i-1]) {
					counter3++;
					if(pairCount==0) {
						pairPosition1 = dice[i];
					}
					else {
						pairPosition2 = dice[i];
					}
				}
					if(counter3==2) {
						pairCount++;
						
					}
					if(counter3==2 && pairCount==2){
						if(pairCount==2) {
							total = (dice[pairPosition1]*2) + (dice[pairPosition2+1]*2);
						}
					}
			}
		}else if(category.equals("threeEquals")) {
			Arrays.sort(dice);
			int counter4 = 1;
			int pairPosition = 0;
			for (int i = dice.length - 1; i > 0; i--) {
				if(dice[i]==dice[i-1]) {
					counter4++;
					pairPosition = dice[i];
					if(counter4==3) {
						total = (dice[pairPosition-1]*3);
					}
				}
				if(dice[i]!=dice[i-1]) {
					counter4=1;
					pairPosition = dice[i];
				}
					
			}
		}else if(category.equals("fourEquals")) {
			Arrays.sort(dice);
			int counter5 = 1;
			int pairPosition = 0;
			for (int i = dice.length - 1; i > 0; i--) {
				if(dice[i]==dice[i-1]) {
					counter5++;
					pairPosition = dice[i];
					if(counter5==4) {
						total = (dice[pairPosition-1]*4);
					}
				}
				if(dice[i]!=dice[i-1]) {
					counter5=1;
					pairPosition = dice[i];
				}
					
			}
		}else if(category.equals("smallStraight")) {
			Arrays.sort(dice);
			int counter6 = 1;
			for (int i = 0; i < dice.length - 1; i++) {
				if(dice[i]==counter6) {
					counter6++;
				}
					if(counter6==5) {
						total = 15;
					}
			}
		}else if(category.equals("largeStraight")) {
			Arrays.sort(dice);
			int counter7 = 2;
			for (int i = 0; i < dice.length - 1; i++) {
				if(dice[i]==counter7) {
					counter7++;
				}
					if(counter7==5) {
						total = 20;
					}
			}
		}else if(category.equals("fullhouse")) {
			Arrays.sort(dice);
			if((dice[0]==dice[1]) && (dice[0]==dice[2])) {
				if((dice[3]==dice[4]) && (dice[3]!=dice[0]) ) {
					total = (dice[0]*3) + (dice[3]*2);
				}
			}
			if((dice[4]==dice[3]) && (dice[4]==dice[2])) {
				if((dice[0]==dice[1]) && (dice[3]!=dice[0]) ) {
					total = (dice[4]*3) + (dice[0]*2);
				}
			}
		}
		else if(category.equals("yahtzee")) {
			Arrays.sort(dice);
			if((dice[0]==dice[1]) && (dice[0]==dice[2])) {
				if(dice[3]==dice[4]) {
					total = 50;
				}
			}
		}else if(category.equals("chance")) {
			for(int i=0;i<dice.length;i++) {
				total+=dice[i];
			}
		}
		

		return total;
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of method	

}//end class
