package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.lang.ArrayUtils;

public class AliGCalculator {

    private Scanner scan = new Scanner( System.in );

    String[] operations = { "addition", "subtraction", "multiplication", "division" };

    public static void main( String[] args ) {
        new AliGCalculator().helloWorld();
    }

    private void helloWorld() {
        System.out.println( "Techmology, Wha is it all about?"
                + "\nis it GOOD or is it WAK?" );
        int[] a = { 3, 9, 3, 1, 2, 3 };
        int[] b = { 5, 7, 3, 4, 7 };

        List<Integer> result = calculate( a, b, operations[ 0 ] );

        for ( int i = 0; i < result.size(); i++ ) {
            System.out.println( "i:" + i + "/>" + result.get( i ) );
        }
    }

    public List<Integer> calculate( int[] a, int[] b, String operation ) {
        List<Integer> result = new ArrayList();

        ArrayUtils.reverse( a );
        ArrayUtils.reverse( b );

        int aL = a.length, bL = b.length;
        int eL = aL > bL ? aL : bL;

        int remainder = 0; //остатък
        int opRes = 0; //operation result

        for ( int i = 0; i < eL; i++ ) {
            if ( i < aL && i < bL ) {

                if ( operation.equals( operations[ 0 ] ) ) {
                    opRes = a[ i ] + b[ i ] + remainder;
                    remainder = 0;

                    List<Integer> opResList = splitResultToList( opRes );

                    if ( opResList.size() > 1 ) {
                        remainder = opResList.get( 1 );
                    }
                    result.add( opResList.get( 0 ) );
                }
            } else {
                if ( operation.equals( operations[ 0 ] ) ) {
                    if ( i < aL || i < bL ) {
                        if ( i >= bL ) {

                            opRes = a[ i ] + remainder;
                        } else if ( i >= aL ) {

                            opRes = b[ i ] + remainder;
                        }
                        remainder = 0;

                        List<Integer> opResList = splitResultToList( opRes );

                        if ( opResList.size() > 1 ) {
                            remainder = opResList.get( 1 );
                        }
                        result.add( opResList.get( 0 ) );

                    } else {
                        System.out.println( "Nobody has more elements" );
                    }
                }
            }
        }

        return result;
    }

    private List<Integer> splitResultToList( int opRes ) {
        List<Integer> opResList = new ArrayList<Integer>();
        do {
            opResList.add( opRes % 10 );
            opRes /= 10;
        } while ( opRes > 0 );

        return opResList;
    }

}
