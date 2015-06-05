

import java.util.Random;
import java.util.Scanner;

public class soru8 {
	
	public static void main(String[] args) {
		resize();
	}

    public static void resize(){
    	
    
        Scanner input = new Scanner(System.in);
        int elemanlar;
        Random rand = new Random();        


        
        System.out.print("eleman sayisi=  ");
        elemanlar = input.nextInt();
        int dizi[] = new int[elemanlar];
        
       
        for (int i = 0; i < elemanlar; i++) {
        	dizi[i] = rand.nextInt();
        }
        
        for(int yaz = elemanlar-1; yaz>= 0 ; yaz--){
        	System.out.print("  " + dizi[yaz]);
        }
    }
        

}
