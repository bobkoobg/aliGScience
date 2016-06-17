package logic;

import java.util.List;
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
        a = new int[]{ 5, 1, 0, 9, 4, 2, 3 };
        b = new int[]{ 3, 8, 2, 0, 0, 6, 4, 7 };
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
        int[] expected = { 0, 7, 0, 0, 1, 3, 3, 4 };
        List<Integer> result = aliGCalculator.calculate( a, b, operations[ 0 ] );

        assertEquals( expected.length, result.size() );
    }

}
