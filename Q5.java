/*
 Name: SWASTIK MULLICK
 Registration no.: 2241013379
 Program: Write a java program to exchange the value of 4 variables W,G,K,A such
 		  that the value of W will move to A, A to K, K to G and finally G to W.
 		  Exchange using with and without using extra variables.
 */
public class Q5 
{
	public static void main(String args[])
	{
		int W=1,G=2,K=3,A=4,T;
		System.out.print("Values before swapping (using extra variable):-\nG="+G+"\nK="+K+"\nA="+A+"\nW="+W+"\n\nValues after swapping (using extra variable):-\n");
		T=W;W=G;G=K;K=A;A=T;
		System.out.print("G="+G+"\nK="+K+"\nA="+A+"\nW="+W);
		System.out.print("\n------------------------------------------------------------------------------------\n");
		System.out.print("Values before swapping (without using extra variables):-\nG="+G+"\nK="+K+"\nA="+A+"\nW="+W+"\n\nValues after swapping (without using extra variables):-\n");
		W=W+A+K+G;
		A=W-A-K-G;
		K=W-A-K-G;
		G=W-A-K-G;
		W=W-A-K-G;
		System.out.print("G="+G+"\nK="+K+"\nA="+A+"\nW="+W+"\n----------------------------------------EOF-----------------------------------------\n");
	}
}
