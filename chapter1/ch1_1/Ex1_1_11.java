package chapter1.ch1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * 
 * @author xie
 * 这里空格难以分辨，因此改用#标识false
 */
public class Ex1_1_11 {
	public static void main(String[] args){
		boolean[][] matrix = {{true, false},{false,true}};
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				if (matrix[i][j]) StdOut.print("*("+i+"," +j+") ");
				else StdOut.print("#("+i+","+j+") ");
			}
			StdOut.println();
		}
	}
}
