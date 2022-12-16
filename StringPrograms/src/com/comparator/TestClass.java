package com.comparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		
		int T = Integer.parseInt(br.readLine().trim()); // no of tst cases
		
		for (int t_i = 0; t_i < T; t_i++) {
			
			
			int N = Integer.parseInt(br.readLine().trim()); // no of elements
			String S = br.readLine(); // No of String

			int out_= solve(N, S);
			System.out.println(out_); // result

		}

		wr.close();
		br.close();
	}

	static int solve(int N, String S) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < N; i++) {
			sum1 += Character.getNumericValue(S.charAt(i));
			sum2 += Character.getNumericValue(S.charAt(i + N));
		}
		if ((sum1 - sum2) % 9 == 0)
			return Math.abs((sum1 - sum2) / 9);
		else
			return Math.abs((sum1 - sum2) / 9) + 1;
	}
}