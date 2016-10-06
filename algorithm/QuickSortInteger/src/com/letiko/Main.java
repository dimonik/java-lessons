/**
 *  QuickSort algorithm implementation by Robert Sedgewick and Kevin Wayne
 *  with minor modifications by dimonik
 *
 *  @author dimonik
 */

package com.letiko;

import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.StdOut;

public class Main {

    public static void main(String[] args) {

        Integer[] a = {9, 6, 1, 10, 8, 4, 2, 5, 7, 3};

        StdOut.print("\n\n");
        System.out.println("Lets sort them using QUICKSORT algorithm:\n");

        Quick.sort(a);

        StdOut.print("\n");
        System.out.println("sorted result is:");
        Quick.showArray(a);
    }
}
