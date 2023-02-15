package diziler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.
		int[][] matris = new int[3][3];
		
		for(int i=0; i<matris.length; i++) {
			for(int j=0; j<matris[i].length; j++) {
				matris[i][j] = (int)(Math.random() * 100);
			}
		}
		
		for(int i=0; i<matris.length; i++) {
			for(int j=0; j<matris[i].length; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("=========================================");
		
		
		//Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
		int[][] matris1 = new int[4][3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<matris1.length; i++) {
			for(int j=0; j<matris1[i].length; j++) {
				System.out.print("Matrisin " + (i+1) + ". satırı " + (j+1) + ".sütunu için değer giriniz : ");
				matris1[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("--------------------");
		
		for(int i=0; i<matris1.length; i++) {
			for(int j=0; j<matris1[i].length; j++) {
				System.out.print(matris1[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
