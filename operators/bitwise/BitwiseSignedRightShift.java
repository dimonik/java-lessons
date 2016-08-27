/*
 * Copyright 2016 Dmytro Nikandrov
 *
 * The signed right shift operator >> uses 'sign extension':
 * If the value is positive, zeroes are inserted at the higher-order bits;
 * if the value is negative, ones are inserted at the higher-order bits.
 * ATTENTION: System.out.println() does not show leading zeroes.
 */


public class BitwiseSignedRightShift
{
    static final int maxi = 6;
    
    
    public static void main( String[] args )
    {
        System.out.println( "---------------------------------" );
        System.out.println( "Bitwise Signed Right Shift" );
        System.out.println();
        
        int a = 19;
        int b = 0;
        
        System.out.println("We have a = " + Integer.toBinaryString(a) + " as binary");
        System.out.println();

        for (int i = 0; i < maxi; i++)
        {
            b = a >> i;
            System.out.println("a >> " + i);
            System.out.println(" = " + Integer.toBinaryString(b) + " as binary");
            System.out.println(" = " + b + " as decimal");
            System.out.println();        
        }

/*
bad coding style, but very clear
 
        b = a >> 0;
        System.out.println("a >> 0");
        System.out.println(" = " + Integer.toBinaryString(b) + " as binary");
        System.out.println(" = " + b + " as decimal");
        System.out.println();        
        
        b = a >> 1;
        System.out.println("a >> 1");
        System.out.println(" = " + Integer.toBinaryString(b) + " as binary");
        System.out.println(" = " + b + " as decimal");
        System.out.println();
        
        b = a >> 2;
        System.out.println("a >> 2");
        System.out.println(" = " + Integer.toBinaryString(b) + " as binary");
        System.out.println(" = " + b + " as decimal");
        System.out.println();
        
        b = a >> 3;
        System.out.println("a >> 3");
        System.out.println(" = " + Integer.toBinaryString(b) + " as binary");
        System.out.println(" = " + b + " as decimal");
        System.out.println();
        
        b = a >> 4;
        System.out.println("a >> 4");
        System.out.println(" = " + Integer.toBinaryString(b) + " as binary");
        System.out.println(" = " + b + " as decimal");
        System.out.println();
*/
        System.out.println( "---------------------------------" );
        }
}
