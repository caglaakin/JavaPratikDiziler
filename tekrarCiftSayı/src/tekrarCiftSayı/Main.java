package tekrarCiftSayı;

public class Main {

	public static boolean isFind(int[] arr, int value) {
		for(int i : arr) {
			if(i == value) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,8,15,26,4,12,32,26,15,4,8,32};
		int[] dup = new int[arr.length];
		int start = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if((arr[i] % 2 == 0) && (i!=j) && (arr[i] == arr[j])) {
					if(!isFind(dup, arr[i])) {
						dup[start++] = arr[i];
					}
					break;
				}
			}
		}
		
		for(int k: dup) {
			if(k!=0) {
				System.out.println(k);
			}
		}
		
		
		
	}

}
