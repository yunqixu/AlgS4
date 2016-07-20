package chapter1.ch1_1;

import edu.princeton.cs.algs4.StdIn;

public class Ex1_1_21 {
	public static void main(String[] args){
		while ((!StdIn.isEmpty())){
			String name = StdIn.readString();
			int num1 = StdIn.readInt();
			int num2 = StdIn.readInt();
			System.out.printf("%s %d %d %.3f", name, num1, num2, num1 * 1.0 / num2);
		}
	}
}
