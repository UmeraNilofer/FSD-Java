package com;
import java.util.Scanner;

public class longestIncreasingSubsequence {

	public int[] lis(int[] A) {
		int n=A.length-1;
		int[] M=new int[n+1];
		int[] P=new int[n+1];
		int L=0;
		for(int i=1;i<n+1;i++) {
			int j=0;
			for(int pos=L;pos>=1;pos--) {
				if(A[M[pos]] < A[i]) {
					j=pos;
					break;
				}
			}
			P[i]=M[j];
			if(j==L || A[i]< A[M[j+1]]) {
				M[j+1]=i;
				L=Math.max(L, j+1);
			}
		}
		
		int[]res=new int[L];
		int pos=M[L];
		for(int i=L-1;i>=0;i--) {
			res[i]=A[pos];
			pos=P[pos];
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println("To find the Longest Increasing Subsequence");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		System.out.println("Enter "+n+" elements");
		for(int i=1;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		
		longestIncreasingSubsequence obj=new longestIncreasingSubsequence();
		int[] res=obj.lis(arr);
		
		System.out.println("Longest Increasing Subsequence: ");
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
