package chapter1.ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_3 {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if (a == b && b == c) StdOut.print("equal");
		else StdOut.print("not equal");
	}
}
