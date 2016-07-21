package chapter1.ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_22 {
	public static int rank(int key, int[] a, int depth){
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi){
			for (int i = 0; i < depth; i++) StdOut.print(" ");
			StdOut.println(lo + " " + hi);
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;
			depth++;
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int key = 2;
		int result = rank(key, a, 0);
		System.out.println(result);
	}
}
