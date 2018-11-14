import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TriangleTest {

    @Parameters(name="{0} expected type {1}")
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
                //positive testing
                {new Triangle(24, 25, 7), 1},
                {new Triangle(30, 25, 30), 2},
                {new Triangle(99, 99, 99), 3},
                //testing with negative numbers
                {new Triangle(-24, -25, -7), 4},
                {new Triangle(-24, 25, 7), 4},
                {new Triangle(24, -25, 7), 4},
                {new Triangle(24, 25, -7), 4},
                {new Triangle(-30, 25, -30), 4},
                {new Triangle(-99, -99, -99), 4},
                //testing with 0
                {new Triangle(0, 25, 7), 4},
                {new Triangle(24, 0, 7), 4},
                {new Triangle(24, 25, 0), 4},
                {new Triangle(0, 25, 0), 4},
                {new Triangle(0, 0, 0), 4},
                // testing with 1
                {new Triangle(1, 1, 1), 3},
                {new Triangle(1, 20, 20), 2},
                {new Triangle(1, 2, 3), 4},
                // testing
                {new Triangle(15, 20, 36), 4},
                {new Triangle(15, 20, 35), 4},
                {new Triangle(15, 20, 34), 1}
        });
    }

    private final Triangle triangle;
    private final int expectedType;

    public TriangleTest(Triangle triangle, int type) {
        this.triangle = triangle;
        this.expectedType = type;
    }

    @Test
    public void getType() {
        assertEquals(expectedType, triangle.getType());
    }

}