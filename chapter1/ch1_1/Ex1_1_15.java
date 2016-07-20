package chapter1.ch1_1;

public class Ex1_1_15 {
	public static int[] histogram(int[] a, int m){
		int[] result = new int[m];
		for (int i : a){
			if (i > 0 && i <= m){
				result[i-1] += 1;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,3};
		int m = 5;
		int[] result = histogram(a,m);
		for (int i : result) System.out.println(i);
	}
}
