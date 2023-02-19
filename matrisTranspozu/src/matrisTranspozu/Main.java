package matrisTranspozu;

public class Main {

	public static void print(int[][] arr) {
		for(int[] a : arr) {
			for(int b: a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void transpoze(int[][] arr) {
		int m=arr.length,n=arr[0].length;
		int[][] arrT = new int[n][m];
		
		for(int i=0; i< m; i++) {
			for(int j=0; j < n; j++) {
				arrT[j][i] = arr[i][j];
			}
		}
		
		print(arrT);
		
	}
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6}};
		System.out.println("Matris :");
		print(arr);
		System.out.println("Transpoze :");
		transpoze(arr);
		
	}
}
