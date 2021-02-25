/**Exercise 1.99
* Author: Tia Steele
* Project Purpose: Program to receive input from uses for quarterly sales for 6 stores
* Input:  Accepts array of quarterly sales numbers for 6 stores
* Desired Output:  Sales, average sales for each quarter, total sales for each quarter
* 					highest sales per quarter, increase/decrease per quarter
* Variables and Classes:  double[][] sales; double[] totalSales, highest[]; Scanner keyboard; 
* 						  double average, highest, difference.
* Formulas:  none
* Description of the main algorithm: Create a program that will allow a user to enter sales totals
* 									 for 6 stores for each sales quarter. Calculate total sales for all stores, 
* 									 Average sales, Highest sales per quarter, and the difference for each store and total
* 									 per quarter. 
* April 17, 2016
**/

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalesQuarterly 
{

	public static void main(String[] args)
	{
		double[][] sales = new double[6][4];
		double[] totalSales = new double[4];
		double[] highest = new double[4];
		
		getSales(sales);
		getTotal(sales, totalSales);
		getAverage(totalSales);
		getHighest(sales, highest);
		getDif(sales);
		getDifTotal(totalSales);
		
	}	
	
	
	    //method to fill array with sales numbers and print chart
		private static void getSales(double[][] array)
		{
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter the Quarterly Sales Per Division");
			
								
			for(int row = 0; row < array.length; row++)
			{
				System.out.println("Division #" +(row+1)+ " ");
				for(int col = 0; col< array[row].length; col++)
				{
					array[row][col] = keyboard.nextDouble();
					
				}
			}	
			
			System.out.println("                  Q1         Q2         Q3         Q4");
			for(int row = 0; row < array.length; row++)
			{
				System.out.print("\nDivision #" +(row+1) + " ");
				for(int col = 0; col< array[row].length; col++)
				{
					System.out.printf(" %10.2f",array[row][col]);
					
				}
			}	
			
			
		}
				
		//method to calculate totals
		private static void getTotal(double[][] arr, double[] array1)
		{
			
				
			System.out.print("\nTotals:    ");
			for(int col = 0; col < arr[0].length; col++)
			{
				for(int row = 0; row <arr.length; row ++)
				{
					array1[col] += arr[row][col];
					
				}
			}
			
			for(int col = 0; col < array1.length; col++)
			{
				System.out.printf(" %10.2f", array1[col]);
			}
		}
		
		//method to calculate average
		private static void getAverage(double[] array2)
		{
			
			
			double average = 0; //temp variable
			System.out.print("\nAverage:   ");
			
				for(int col = 0; col <array2.length; col ++)
				{
					average = array2[col]/array2.length;
					System.out.printf(" %10.2f",average);
					average = 0; //reset average to be a temp variable
				}
		}
		
		//calculate highest
		private static void getHighest(double[][] array3, double[] high)
		{
			
			double highest = 0;
			
			//find highest
			for(int col = 0; col < array3[0].length; col++)
			{
				for(int row = 0; row <array3.length; row ++)
				{
					
					 if(array3[row][col] > highest)
						 {
						 	highest = array3[row][col];
						 	high[col] = highest;
						 }	 				
				}
				//reset highest
				highest = 0;
				
			}
			//print out highest
			
			System.out.print("\nHighest:   ");
			for(int index = 0; index < high.length; index++)
				{
					
					System.out.printf(" %10.2f", high[index]);
				}
		}
		
		//Decrease or increase per quarter
		private static void getDif(double[][] array4)
		{
			
			double difference = 0; //temp variable
			
			System.out.print("\nDifference in Sales:  ");
			for(int row = 0; row < array4.length; row++)
			{
				System.out.print("\nDivision #" +(row+1) + "     ");
				for(int col = 1; col< array4[row].length; col++)
				{
					difference = array4[row][col] - array4[row][col - 1];
					System.out.printf(" %10.2f",difference);
					difference = 0; //reset temp variable
				}
				
			}			
		}
		
		//Decrease or increase totalSales per quarter
		private static void getDifTotal(double[] array5)
		{
					
			double difference = 0; //temp variable
					
			System.out.print("\nDifference in Sales:  ");
				for(int row = 0; row < array5.length; row++)
				{					
						difference = array5[row] - array5[row - 1];
						System.out.printf(" %10.2f",difference);
						difference = 0; //reset temp variable
					
				}	
		}
}

	

