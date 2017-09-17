/*

print out matrix below
     *  2  3  4  *
     6  *  8  * 10
    11 12  * 14 15
    16  * 18  * 20
     * 22 23 24  *

result
    * 2 * 4 *
    6 * 8 * 10
    11 12 * 14 15
    16 * 18 * 20
    * 22 23 24 *

*/

package com.letiko;


public class Main
{
    public static void main(String[] args)
    {
        int[][] matrix;

        matrix = new int[5][5];

        int row, column, number = 1;

        for(row = 0; row < 5; row++)
            for(column = 0; column < 5; column++)
            {
                matrix[row][column] = number;
                number++;
            }


        for(int[] newRow : matrix)
        {
            printRow(newRow);
        }
    }

    public static void printRow(int[] newRow)
    {
        for (int theNumber : newRow)
        {
            if (theNumber % 2 == 0 | theNumber == 11 | theNumber == 15 | theNumber == 23)
            {
                System.out.print(" " + theNumber);
            }
            else
            {
                System.out.print(" *");
            }
        }
        System.out.println();
    }
}
