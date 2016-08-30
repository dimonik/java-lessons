/*
 * Copyright 2016 Dmytro Nikandrov
 *
 * The unary bitwise complement operator "~" inverts a bit pattern;
 * it can be applied to any of the integral types, making every "0" a "1" and every "1" a "0".
 * For example, a byte contains 8 bits; applying this operator to a value whose bit pattern is "00000000" would 
 * change its pattern to "11111111".
 */


public class BitwiseComplement
{
    public static void main( String[] args )
    {
        System.out.println( "---------------------------------" );
        System.out.println( "Bitwise Complement ~" );
        System.out.println();
        
        int a = 1;
        int b = 0;

        System.out.println("var a = " + Integer.toBinaryString(a) + " (as binary)");
        System.out.println("result ~a = " + Integer.toBinaryString(~a));
        System.out.println();
        System.out.println("var b = " + b + " (as binary)");
        System.out.println("result ~b = " + Integer.toBinaryString(~b));
        System.out.println( "---------------------------------" );
    }
}