/*
 * Copyright 2016 Dmytro Nikandrov
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