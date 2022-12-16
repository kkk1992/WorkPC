package com.demo.java.stream;
import java.io.*;
import java.util.*;
 
 
public class TestClass {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        
        int T = Integer.parseInt(br.readLine().trim());
        for(int i = 0; i < T; i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String S = br.readLine();
 
            int out_ = solve(N, S);
            System.out.println(out_);
            
         }
 
         wr.close();
         br.close();
    }
    static int solve(int N, String S){
       // Write your code here
       int sum1=0;
       int sum2=0;
       int count=0;
       
       for(int i=0;i<N;i++){
           sum1=sum1+ (S.charAt(i)-'0');
       }
       for(int i=N;i<2*N;i++){
           sum2= sum2+  (S.charAt(i)-'0');
       }
       if(sum1>sum2){
           int i=0;int j=2*N-1;
           while(sum1!=sum2){
        	   
               if(Math.abs(sum1-sum2)>9)
               sum2=sum2+9;
               
               else
               sum2=sum2+Math.abs(sum1-sum2);
               count++;
           }
       }
       else{
              int i=0,j=2*N-1;
           while(sum1!=sum2){
               if(Math.abs(sum1-sum2)>9)
               sum1= sum1+9;
               else
               sum1= sum1+Math.abs(sum1-sum2);
               count++;
           }
       }
       return count;
    }
}

/*
 * Problem
You are given a string of length 2N consisting of only digits from 0 to 9. You can make a move to choose an arbitrary position and replace the digit in that position with any digit from 0 to 9.

Task

Determine the minimum number moves required to make the sum of the first N digits equal to the sum of the N digits that follow.

Note: 1-based indexing is used.

Example

Assumptions

N = 3
S = 111279
Approach

Change S[1] from 1 to 9
Change S[5] from 7 to 0
Now, S = 911209

Therefore, the sum of S[1] to S[3] = 9 + 1 + 1 = 11 and the sum of S[4] to S[6] = 2 + 0 + 9 = 11.

Hence, the minimum number of moves required is 2.

Note: There can be other possible ways to achieve the answer, but we can not get the required result sum in less than 2 changes.
*/
