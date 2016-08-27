/*
 * Copyright 2016 Dmytro Nikandrov
 *
 * The unsigned right shift operator ">>>" inserts a zero into the leftmost position,
 * while the leftmost position after ">>" depends on 'sign extension'.
 * ATTENTION: System.out.println() does not show leading zeroes.
 */


public class BitwiseUnsignedRightShift
{
    static final int maxi = 9;
    
    
    public static void main( String[] args )
    {
        System.out.println( "---------------------------------" );
        System.out.println( "Bitwise Signed Right Shift" );
        System.out.println();
        
        int a = -19;
        int b = 0;
        
        System.out.println("We have a = " + Integer.toBinaryString(a) + " as binary");
        System.out.println();

        for (int i = 0; i < maxi; i++)
        {
            b = a >>> i;
            System.out.println("a >>> " + i);
            System.out.println(" = " + Integer.toBinaryString(b) + " as binary");
            System.out.println(" = " + b + " as decimal");
            System.out.println();        
        }

        System.out.println( "---------------------------------" );
        }
}
