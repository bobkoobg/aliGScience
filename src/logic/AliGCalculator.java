package logic;

import java.util.Scanner;

public class AliGCalculator {

    private Scanner scan = new Scanner( System.in );

    String[] operations = { "addition", "subtraction", "multiplication", "division" };

    public static void main( String[] args ) {
        new AliGCalculator().helloWorld();
    }

    private void helloWorld() {
        System.out.println( "Techmology, Wha is it all about?"
                + "\nis it GOOD or is it WAK?" );
        int[] a = { 1, 2, 3 };
        int[] b = { 3, 4, 7 };

        int[] result = calculate( a, b, operations[ 0 ] );

        for ( int i = 0; i < result.length; i++ ) {
            System.out.println( "i:" + i + "/>" + result[ i ] );
        }
    }

    public int[] calculate( int[] a, int[] b, String operation ) {
        int[] result = new int[ 0 ];
        return result;
    }

}
