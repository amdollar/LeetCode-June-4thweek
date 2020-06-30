package io.test.ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {

	public static void main(String[] args) {
		char[][] arr = new char[][] { { 'a' }, { 'a' } };
		String[] words = new String[] { "" };
		List<String> res = wordSearch(arr, words);
		res.forEach(System.out::println);

	}

	private static List wordSearch(char[][] arr, String[] words) {
		List<String> result = new ArrayList<>();
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				for (String str : words) {
					if (arr[i][j] == str.charAt(0) && dfs(arr, i, j, 0, str) && !result.contains(str)) {
						result.add(str);
					}
				}
			}
		}

		return result;
	}

	private static boolean dfs(char[][] arr, int i, int j, int count, String word) {
		if (count == word.length()) {
			return true;
		} // if value of count in current iteration is greater that word length.

		if (i < 0 || i >= arr.length || j < 0 || j >= arr[i].length || arr[i][j] != word.charAt(count)) {
			return false;
		}
		// if currently out of bored of dfs search is not working(last condition)

		char temp = arr[i][j];
		arr[i][j] = ' ';

		boolean found = dfs(arr, i + 1, j, count + 1, word) || dfs(arr, i - 1, j, count + 1, word)
				|| dfs(arr, i, j + 1, count + 1, word) || dfs(arr, i, j - 1, count + 1, word);

		arr[i][j] = temp;

		return found;
	}

}
