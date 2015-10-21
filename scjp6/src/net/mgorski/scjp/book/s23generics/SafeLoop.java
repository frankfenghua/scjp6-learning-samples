package net.mgorski.scjp.book.s23generics;

/**
 * Created by feng.hua on 10/21/2015.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SafeLoop {
    public static void main( String [] args )
    {
        List<Integer> l = new ArrayList<Integer>();

        Integer i1 = new Integer( 1 );
        Integer i2 = new Integer( 2 );
        String  i3 = "3";
        Integer i4 = new Integer( 4 );

        l.add( i1 );
        l.add( i2 );
//        l.add( i3 );   // this will now fail at compile time
        // you won't have to wait until runtime to get an exception
        l.add( i4 );

        System.out.println( sum( l ) );

    }

    public static int sum( List<Integer> pList )
    {
        int counter = 0;

        for( int i = 0; i < pList.size(); i ++ )
        {
            Integer integer = pList.get( i );
            counter += integer.intValue();
        }

        return counter;
    }

}
