/*
 * Copyright 2016 Dmytro Nikandrov
 *
 * The Remainder or Modulus Operator
 */


/*
calculated by java
	explanaition by tutor

4 % 1 = 0
	4 / 1 = 4
	4 - 4*1 = 0

4 % 2 = 0
	4 / 2 = 2
	4 - 2*2 = 0

4 % 3 = 1
	4 / 3 = 1
	4 - 3*1 = 1

4 % 4 = 0
	4 / 4 = 1
	4 - 4*1 = 0

4 % 5 = 4
	4 / 5 = 0
	4 - 5*0 = 4

4 % 6 = 4
	4 / 6 = 0
	4 - 6*0 = 4

4 % 7 = 4
	4 / 7 = 0
	4 - 7*0 = 4

4 % 8 = 4
	4 / 8 = 0
	4 - 8*0 = 4

4 % 9 = 4
	4 / 9 = 0
	4 - 9*0 = 4

*/

public class Remainder
{
	public static void main( String[] args )
	{
		System.out.println( "---------------------------------" );
		int s = 0;
		for (int i = 1; i < 10; i++)
		{
			System.out.println();
			for (int j = 1; j < 10; j++)
			{
				s = i % j;
				System.out.println(i + " % " + j + " = " + s);
			}
		}
		System.out.println( "---------------------------------" );
	}
}