package yakinMaxMin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] list = {56, 34, 1, 8, 101, -2, -33,-59,-94};
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.print("Dizi : " + Arrays.toString(list) + "\nGirilen sayı : ");
		int number = scan.nextInt();
		Arrays.sort(list);
        
		int min = list[0],max = list[0],distN = Math.abs(number - min);
		int j = 0;

        
        for(int i=0; i<list.length; i++) {
        	j = list[i];
        	if(Math.abs(j - number) < distN) {
        		distN = Math.abs(j - number);
        		if(number > j) {
        			min = j;        			
        		}else {
        			max = list[i];
        			break;
        		}
        	}if(Math.abs(j - number) > distN) {
        		max = j;
        		break;
        	}
        
        }
        
              
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

	}

}
