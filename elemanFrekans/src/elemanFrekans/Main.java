package elemanFrekans;

import java.util.Arrays;

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
		//Dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
		
		int[] arr = {10,12,25,14,63,25,10,8,63,14,25,8,25,8,14,10,35,100,35,25};
		int[] dup = new int[arr.length];
		int[] value = new int[arr.length];
		int start = 0,count;
		
		System.out.println("Dizi : " + Arrays.toString(arr) + "\nTekrar sayıları : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(!isFind(dup, arr[i])) {
						dup[start++] = arr[i];
				}
			}
		}
		
		for(int a=0; a<dup.length; a++) {
			count=0;
			if(dup[a] != 0) {
				for(int k=0; k<arr.length; k++) {
					if(dup[a] == arr[k]) {
						count++;
					}
				}
				value[a] = count;
			}
		}
		
		for(int i=0; i<dup.length; i++) {
			if((dup[i] != 0)) {
				System.out.println(dup[i] + " sayısı " + value[i] + " kere tekrar edilmiştir.");
			}
		}
		
	}

}
