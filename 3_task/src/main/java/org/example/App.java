package org.example;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        collectionWithLogger<Integer> a = new collectionWithLogger<Integer>();
        System.out.println( a.size());
        System.out.println(a.add(12));
        System.out.println(a.size());
    }
}
