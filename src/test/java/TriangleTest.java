import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TriangleTest {

    @Parameters(name = "{0} expected type {1}")
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
                {new Triangle(24, 25, 7), 1},
                {new Triangle(30, 25, 30), 2},
                {new Triangle(99, 99, 99), 3},
                {new Triangle(-35, -18, -22), 4},
                {new Triangle(-240, 250, 70), 4},
                {new Triangle(88, -46, 72), 4},
                {new Triangle(307, 205, -289), 4},
                {new Triangle(-48, 55, -48), 4},
                {new Triangle(-274, -274, -274), 4},
                {new Triangle(0, 8, 7), 4},
                {new Triangle(13, 0, 16), 4},
                {new Triangle(12, 15, 0), 4},
                {new Triangle(0, 5, 0), 4},
                {new Triangle(0, 0, 0), 4},
                {new Triangle(1, 1, 1), 3},
                {new Triangle(1, 20, 20), 2},
                {new Triangle(1, 2, 3), 4},
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