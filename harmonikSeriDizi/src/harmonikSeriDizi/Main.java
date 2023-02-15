package harmonikSeriDizi;

public class Main {

	public static void main(String[] args) {
		double total1 = 0,sum = 0;
		double[] harmonic1 = new double[6];
		int[] harmonic = {15,19,20,63,45,14};
		
		
		for(int j=0; j<harmonic.length;j++) {
			double total = 1;
			for(int i=2; i<=harmonic[j]; i++) {
				total += (1.0/i);
			}
			harmonic1[j] = total;
			System.out.println("Sayı : " + harmonic[j] +"\nHarmonik Seri : " + total);
			System.out.println("---------------");
		}
		
		for(int i=0; i<harmonic1.length; i++) {
			System.out.print(harmonic1[i] + "   ");
			total1 += harmonic1[i];
		}System.out.println("\n-----------------------");
		
		sum = total1/harmonic1.length;
		System.out.println("Toplam : " + total1 + "\nOrtalama : " + sum);
	}

}
