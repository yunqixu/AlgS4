package chapter1.ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_23 {
	public static int rank(int key, int[] a){
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi){		
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}
	
	public static void printIn(int[] whitelist){
		for (int i : whitelist){
			if (rank(i,whitelist) < 0){
				StdOut.println(i);
			}
		}
	}
	
	public static void printOut(int[] whitelist){
		for (int i : whitelist){
			if (rank(i,whitelist) >= 0){
				StdOut.println(i);
			}
		}
	}
	
	public static void main(String[] args){
		String tag = args[0];
		int[] whitelist = {1,2,3,4,5,6,7,8,9};
		if (tag.equals("+")) printIn(whitelist);
		else if (tag.equals("-")) printOut(whitelist);
	}
}
