package com.anushachandran1502.patterns;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number of n");
		int n=scan.nextInt();
		pattern1(n);
		pattern2(n);
		pattern3(n);
		pattern4(n);
		pattern5(n);
		pattern6(n);
		pattern7(n);
		pattern8(n);
		pattern9(n);
		pattern10(n);
		pattern11(n);
		pattern12(n);
		pattern13(n);
		pattern14(n);
	}
	//pattern 1
	static void pattern1(int n)
	{
		System.out.println("pattern1");
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(i==1 || i==j || j==n)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	// pattern 2
	static void pattern2(int n)
	{
	System.out.println();
	System.out.println("pattern2");
	System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(i==1|| j==1 || j==n-i+1)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	// pattern 3
		static void pattern3(int n)
		{
		System.out.println();
		System.out.println("pattern3");
		System.out.println();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n*2-1;j++)
				{
				if(i==1 || i==j || i+j==n*2)
					System.out.print("*");
				else
					System.out.print(" ");
				}
				System.out.println();
			}
			
		}
		// pattern 4
				static void pattern4(int n)
				{
				System.out.println();
				System.out.println("pattern4");
				System.out.println();
					
					for(int i=1;i<=n;i++)
					{
						for(int j=1;j<=(n*2)-1;j++)
						{
						if(i==n|| j==n+i-1 || i+j==n+1)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");}
						}
						System.out.println();
					}
				}
				// pattern 5
				static void pattern5(int n)
				{
				System.out.println();
				System.out.println("pattern5");
				System.out.println();
					
					for(int i=0;i<n;i++)
					{
						for(int j=0;j<n;j++)
						{
							if(i==0  || i==n-1 || j==n-1 || j==0)
								System.out.print("*");
							else
								System.out.print(" ");
						}
						System.out.println("");
						for(int k=0;k<=i;k++)
						{
							System.out.print(" ");
						}
					}
				}

				// pattern 6
				static void pattern6(int n)
				{
					System.out.println();
					System.out.println("pattern6");
					System.out.println();
				for(int i=0;i<n;i++)
				{
					for(int k=0;k<n-i-1;k++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<n;j++)
					{
						if(i==0  || i==n-1 || j==n-1 || j==0)
							System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println("");
					
				}

					
				}
				// pattern 7
				static void pattern7(int n)
				{
					System.out.println();
					System.out.println("pattern7");
					System.out.println();	
					for(int i=1;i<=(n*2)-1;i++)
					{
						
						for(int j=1;j<=n;j++)
						{
							if(j==1 || i==j || i+j==n*2)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
						}
						System.out.println();
					}
				}
				// pattern 8
				static void pattern8(int n)
				{
					System.out.println();
					System.out.println("pattern8");
				System.out.println();
					
					for(int i=1;i<=(n*2)-1;i++)
					{
						for(int j=1;j<=n;j++)
						{
							if(j==n || i+j==n+1 || i-j==n-1)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
						}
						System.out.println();
					}
				}
				
				
				
				
				// pattern 9
				static void pattern9(int n)
				{
					System.out.println();
					System.out.println("pattern9");
					System.out.println();
				 int i, j; 
			        int num = 1; 
			        
			        for (i = 1; i <= n; i++) { 
			            
			            for (j = 1; j <= n - i; j++) { 
			                System.out.print(" "); 
			            } 
			           
			            for (j = 1; j <= 2 * i - 1; j++) { 
			                if (j == 1 || j == 2*i-1) 
			                    System.out.print("*"); 
			                else
			                    System.out.print(" "); 
			            } 
			            System.out.println(); 
			        } 
			  
			         
			        for (i = n-1; i >= 1; i--) 
			        { 
			            for (j = 1; j <= n - i; j++) { 
			                System.out.print(" "); 
			            }  
			            for (j = 1; j <= 2 * i - 1; j++) { 
			                if (j == 1 || j == 2*i-1) 
			                    System.out.print("*"); 
			                else
			                    System.out.print(" "); 
			            } 
			            System.out.println(); 
			        } 
			    } 
				
				
				
				
				
				

				// pattern 10
				static void pattern10(int n)
				{ 
					System.out.println();
					System.out.println("pattern10");
					System.out.println();
					for(int i=0;i<n;i++)
					{
						for(int j=n-1;j>=i;j--)
							System.out.print("*");
						for(int k=0;k<i*2;k++)
							System.out.print(" ");
						for(int l=n-1;l>=i;l--)
							System.out.print("*");
						System.out.println();
					}
					for(int i=0;i<n;i++)
					{
						for(int j=0;j<=i;j++)
							System.out.print("*");
						for(int k=2*n-2;k>i*2;k--)
							System.out.print(" ");
						for(int l=0;l<=i;l++)
							System.out.print("*");
						System.out.println();
					}
						
				}
					
				
				
				
				
				
				
				
				
				// pattern 11
				static void pattern11(int n)
				{
					System.out.println();
					System.out.println("pattern11");
					System.out.println();
					for(int i=0;i<n;i++)
					{
						for(int j=0;j<n;j++)
						{
							System.out.print("*");
						}
					System.out.println();
					}
				}
				
				
				// pattern 12
				static void pattern12(int n)
				{
					System.out.println();
					System.out.println("pattern12");
					System.out.println();
					for(int i=0;i<n;i++)
					{
						for(int j=0;j<n;j++)
						{
							if(i==0 || j==n-1 || i==n-1 || j==0)
							System.out.print("*");
							else
								System.out.print(" ");
						}
					System.out.println();
					}
				}
				
				
				// pattern 13
				static void pattern13(int n)
				{
					System.out.println();
					System.out.println("pattern13");
					System.out.println();
					int i, j; 
			        for (i = 1; i <= n; i++) { 
			            for (j = 1; j < i; j++) { 
			                System.out.print(" "); 
			            } 
			            for (j = i; j <= n; j++) { 
			                if(j==i||j==n||i==1) 
			                    System.out.print("* "); 
			                else
			                    System.out.print("  "); 
			            }  
			            System.out.println(); 
			        } 
			  
			         
			        for (i = n - 1; i >= 1; i--) 
			        { 
			            for (j = 1; j < i; j++) { 
			                System.out.print(" "); 
			            } 
			             
			            for (j = i; j <= n; j++) { 
			                if(j==i||j==n||i==1) 
			                    System.out.print("* "); 
			                else
			                    System.out.print("  "); 
			            } 
			             
			            System.out.println(); 
			        } 
					
			     }


				
				// pattern 14
				static void pattern14(int n)
				{
					int N=(n*2)-1;
					System.out.println();
					System.out.println("pattern14");
					System.out.println();
					for(int i=0;i<N;i++)
					{
						for(int j=0;j<N;j++)
						{
							if((i>=j && i+j<=N-1) || (i<=j && i+j>=N-1))
							{
					System.out.print("*");
							}
							else
					System.out.print(" ");
						}
					System.out.println("");
					}	
				}				

}

