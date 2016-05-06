package com.techgig.challenges;

import java.util.Scanner;

public class PickBigFromGrid {

	public static void main(String[] args) {
		String str[] = {"12#45#33","94#54#23","98#59#27"};
		
		System.out.println(PickBigFromGrid.amount_value(3, str)[0]);
	}

	public static String[] amount_value(int input1, String[] input2) {
		int[][] mainArrray = new int[input1][input1];
		int[] neighbours = new int[10];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < input1; i++) {
			String[] row1 = input2[i].split("#");

			for (int j = 0; j < input1; j++) {
				mainArrray[i][j] = Integer.parseInt(row1[j]);
			}
		}

		int selectedNum = scan.nextInt();

		String[] output = null;
		
		if(findIndex(selectedNum, mainArrray)!="" && findIndex(selectedNum, mainArrray) != null
				&& findIndex(selectedNum, mainArrray).contains("#"))
			output = findIndex(selectedNum, mainArrray).split("#");

		int row = Integer.parseInt(output[0]);
		int column = Integer.parseInt(output[1]); 

		for (int i = 0; i < neighbours.length; i++) {
			if (row >= 0 && column >= 0) {
				if ((row + 1) < input1) {
					neighbours[i] = mainArrray[row + 1][column];

					if ((column + 1) < input1)
						neighbours[i] = mainArrray[row + 1][column + 1];
				}

				if ((column + 1) < input1)
					neighbours[i] = mainArrray[row][column + 1];

				if ((row - 1) >= 0)
					neighbours[i] = mainArrray[row - 1][column];

				if ((column - 1) >= 0)
					neighbours[i] = mainArrray[row][column - 1];

				if ((column - 1) >= 0 && (row - 1) >= 0)
					neighbours[i] = mainArrray[row - 1][column - 1];

				if ((column - 1) >= 0 && (row + 1) < input1)
					neighbours[i] = mainArrray[row + 1][column - 1];

				if ((column + 1) >= 0 &&((row - 1) < input1 && (row - 1)>=0))
					neighbours[i] = mainArrray[row - 1][column + 1];
			}
		}

		neighbours = sortArray(neighbours);
		String ans[] = new String[10];
		
		if (neighbours[0] >= neighbours[1]) {
			ans[0] = findIndex(neighbours[0], mainArrray);
		}
		return ans;
	}

	private static String findIndex(int input, int[][] mainArrray) {
		String ans = "";

		for (int i = 0; i < mainArrray.length; i++) {
			for (int j = 0; j < mainArrray.length; j++) {
				if (mainArrray[i][j] == input) {
						ans = j + "#" + i;
					break;
				}
			}
		}
		return ans;
	}

	private static int[] sortArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			int temp;
			if ((i + 1) < input.length) {
				if (input[i] < input[i + 1]) {
					temp = input[i + 1];
					input[i] = input[i + 1];
					input[i + 1] = temp;
				}
			}
		}
		return input;
	}
}
