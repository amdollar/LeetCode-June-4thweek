package com.leetcode.week4;

public class UniqueBinarySearchTrees {

	public static void main(String[] args) {
		int n = 30;
		int number = getNoOfTotalBST(n);
		System.out.println(number);
	}

	private static int getNoOfTotalBST(int n) {
		int[] G = new int[n + 1];
		G[0] = G[1] = 1;

		for (int i = 2; i <= n; ++i) {
			for (int j = 1; j <= i; ++j) {
				G[i] += G[j - 1] * G[i - j];
			}
		}
		return G[n];
	}

}
