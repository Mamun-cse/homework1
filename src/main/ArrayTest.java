package main;
import java.util.Random;
public class ArrayTest {
	public static void main(String[] arg){
		final int LENGTH=20;
		final int ONE=1;
		final int ZERO=0;
		int[] number= new int[LENGTH];
		int i,check=ZERO;
		Random rand = new Random();
		for(i =ZERO; i<LENGTH;i++){
			number[i] = rand.nextInt(7);
		}
		for(i= ZERO;i<LENGTH;i++){
			if(i<(LENGTH-ONE) && number[i]== number[i+ONE]){
			  if(check==ZERO)
				  System.out.print("(");
			      check =ONE;
			}
		
		System.out.print(number[i]);
		System.out.print(" ");
		if(check==ONE){
			if(i<(LENGTH-ONE) && number[i]!=number[i+ONE]){
				 System.out.print(")");
				      check =ZERO;
			
		    }
		}
	}
		System.out.println();
	

	}
}
