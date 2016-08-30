/*
 * Copyright 2016 Dmytro Nikandrov
 */


public class BitwiseOR
{
    public static void main( String[] args )
    {
        System.out.println( "---------------------------------" );
        System.out.println( "Bitwise OR |" );
        System.out.println();
        
        int a = 0b0;
        int b = 0b1;
        int c = 0;

        System.out.println("var a = " + Integer.toBinaryString(a) + " (as binary)");
        System.out.println("var b = " + Integer.toBinaryString(b) + " (as binary)");

        c = a | b;
        
        System.out.println("result a | b = " + Integer.toBinaryString(c) + " (as binary)");
        System.out.println( "---------------------------------" );
        }
}