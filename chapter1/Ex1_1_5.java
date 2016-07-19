package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_5 {
	public static void main(String[] args){
		double x = 0.0, y = 0.0;
		while (!StdIn.isEmpty()){
			x = StdIn.readDouble();
			y = StdIn.readDouble();
		}
		boolean flag = false;
		if (x > 0.0 && x < 1.0){
			if (y > 0.0 && y < 1.0){
				flag = true;
			}
		}
		if (flag){
			StdOut.print(true);
		}
		else {
			StdOut.print(false);
		}
	}
}
