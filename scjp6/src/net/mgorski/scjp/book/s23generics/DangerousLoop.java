package net.mgorski.scjp.book.s23generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by feng.hua on 10/21/2015.
 */
public class DangerousLoop {
    public static void main( String [] args )
    {
        List l = new ArrayList();

        Integer i1 = new Integer( 1 );
        Integer i2 = new Integer( 2 );
        String  i3 = "3";
        Integer i4 = new Integer( 4 );

        l.add( i1 );
        l.add( i2 );
        l.add( i3 );
        l.add( i4 );

        System.out.println( sum( l ) );

    }
    public static int sum( List l )
    {
        Iterator iterator = l.iterator();

        int counter = 0;

        while( iterator.hasNext() )
        {
            //result in a ClassCastException because it will try to cast a String to an Integer.
            Integer integer = (Integer) iterator.next();
            counter += integer.intValue();
        }

        return counter;
    }

}
