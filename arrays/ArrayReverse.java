class ArrayReverse {
    public static void main(String[] args)
    {
        int[] arr = new int[args.length];
        int len = args.length;
        int tmp = 0;
        
        System.out.println("Array: ");
        
        for (int i=0; i<len; i++)
        {
            arr[i] = Integer.parseInt(args[i]);
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n\nInverted array: ");


        for (int i=0; i<len/2; i++)
        {
            tmp = arr[len-1-i];
            arr[len-1-i] = arr[i] ;
            arr[i] = tmp;
        }
        
        for (int i=0; i<len; i++)
        {
            System.out.print(arr[i] + " " );
        }

        System.out.println("\n\nDone.");
    }
}
