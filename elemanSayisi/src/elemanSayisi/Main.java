package elemanSayisi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinin boyutu n : ");
		int n=scan.nextInt();
		int[] numbers = new int[n];
		int temp = 0;
		
		System.out.println("Dizinin elemanlarını giriniz : ");
		for(int i=0; i<n; i++) {
			System.out.print((i+1) + ". elemanı : ");
			numbers[i] = scan.nextInt();
		}
		
		for(int i=0; i<n ; i++) {
			for(int k=0; k<n; k++) {
				if(numbers[i] < numbers[k]) {
					temp = numbers[i];
					numbers[i] = numbers[k];
					numbers[k] = temp;
				}
			}
		}
		
		System.out.print("Sıralama : " + Arrays.toString(numbers));
		
		

	}

}
