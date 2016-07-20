package chapter1.ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_20 {
	public static double ln(int N){
		if (N == 0) return 0.0;
		return Math.log(N) + ln(N-1);
	}
	
	public static void main(String[] args){
		StdOut.println(ln(0));
		StdOut.println(ln(10));
	}
}
