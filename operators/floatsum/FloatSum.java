/*
 * Copyright 2017 Dmytro Nikandrov
 *
 * 
 */


public class FloatSum
{
    public static float f;

    public static void main( String[] args )
    {
	f = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        System.out.println("f = " + Float.toString(f)); //f = 1.0000001

        f = 10 * 0.1f;
        System.out.println("f = " + Float.toString(f)); //f = 1.0
    }
}
