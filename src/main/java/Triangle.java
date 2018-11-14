public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getType() {

        if (Integer.max(Integer.max(side1, side2), side3) * 2 >= (side1 + side2 + side3) || Integer.min(Integer.min(side1, side2), side3) <= 0) {
            return 4;
        }
        if (side1 == side2 || side1 == side3 || side2 == side3) {
            if (side1 == side2 && side2 == side3) {
                return 3;
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
