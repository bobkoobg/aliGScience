package logic;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AliGCalculator_Test {

    private AliGCalculator aliGCalculator;
    private static int[] a, b;
    private static String[] operations;

    @BeforeClass
    public static void setUpClass() {
        operations = new String[]{ "addition", "subtraction", "multiplication", "division" };
        a = new int[]{ 1, 2, 3 };
        b = new int[]{ 3, 4, 7 };
    }

    @AfterClass
    public static void tearDownClass() {
        operations = null;
        a = null;
        b = null;
    }

    @Before
    public void setUp() {
        aliGCalculator = new AliGCalculator();
    }

    @After
    public void tearDown() {
        aliGCalculator = null;
    }

    @Test
    public void testBasic() {
        int[] expected = { 1, 1, 6, 4 };
        int[] result = aliGCalculator.calculate( a, b, operations[ 0 ] );
        assertEquals( expected.length, result.length );
    }

}
