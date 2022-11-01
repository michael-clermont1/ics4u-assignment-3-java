/**
 * This is the standard Main() class starting point.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2022-10-21
 */

final class Index {
    /**
     * Constant Variable MagicNumberMAGIC3.
     *
     */
    private static final int MAGIC3 = 3;

    /**
     * Constant Variable Valid.
     *
     */
    private static final String VALID = " → Is the triangle valid: ";

    /**
     * Constant Variable Semiperimeter.
     *
     */
    private static final String SPERIMETER = " → Semiperimeter: ";

    /**
     * Constant Variable Area.
     *
     */
    private static final String AREA = " → Area: ";

    /**
     * Constant Variable Type.
     *
     */
    private static final String TYPE = " → Type: ";

    /**
     * Constant Variable Angle1.
     *
     */
    private static final String ANGLE1 = " → Angle 1: ";

    /**
     * Constant Variable Angle2.
     *
     */
    private static final String ANGLE2 = " → Angle 2: ";

    /**
     * Constant Variable Angle3.
     *
     */
    private static final String ANGLE3 = " → Angle 3: ";

    /**
     * Constant Variable mm.
     *
     */
    private static final String MM = " mm";

    /**
     * Constant Variable MM2.
     *
     */
    private static final String MM2 = " mm²";

    /**
     * Constant Variable rad.
     *
     */
    private static final String RAD = " rad";

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Index() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        System.out.println("");
        final Triangle testTriangle1 = new Triangle(MAGIC3, 4, 5);
        System.out.println("Created a 3 mm by 4 mm by 5 mm triangle.");
        System.out.println(VALID
            + testTriangle1.isValid());
        System.out.println(SPERIMETER
            + testTriangle1.semiPerimeter() + MM);
        System.out.println(AREA + testTriangle1.area() + MM2);
        System.out.println(TYPE + testTriangle1.getType());
        System.out.println(ANGLE1 + testTriangle1.angle(1) + RAD);
        System.out.println(ANGLE2 + testTriangle1.angle(2) + RAD);
        System.out.println(ANGLE3
            + testTriangle1.angle(MAGIC3) + RAD);

        System.out.println("");

        final Triangle testTriangle2 = new Triangle(MAGIC3, MAGIC3, MAGIC3);
        System.out.println("Created a 3 mm by 3 mm by 3 mm triangle.");
        System.out.println(VALID
            + testTriangle2.isValid());
        System.out.println(SPERIMETER + testTriangle2.semiPerimeter()
            + MM);
        System.out.println(AREA + testTriangle2.area() + MM2);
        System.out.println(TYPE + testTriangle2.getType());
        System.out.println(ANGLE1 + testTriangle2.angle(1) + RAD);
        System.out.println(ANGLE2 + testTriangle2.angle(2) + RAD);
        System.out.println(ANGLE3
            + testTriangle2.angle(MAGIC3) + RAD);

        System.out.println("");

        final Triangle testTriangle3 = new Triangle(MAGIC3, 4, 4);
        System.out.println("Created a 3 mm by 4 mm by 4 mm triangle.");
        System.out.println(VALID
            + testTriangle3.isValid());
        System.out.println(SPERIMETER
            + testTriangle3.semiPerimeter() + MM);
        System.out.println(AREA + testTriangle3.area() + MM2);
        System.out.println(TYPE + testTriangle3.getType());
        System.out.println(ANGLE1
            + testTriangle3.angle(1) + RAD);
        System.out.println(ANGLE2
            + testTriangle3.angle(2) + RAD);
        System.out.println(ANGLE3
            + testTriangle3.angle(MAGIC3) + RAD);

        System.out.println("");

        final Triangle testTriangle4 = new Triangle(2, MAGIC3, 4);
        System.out.println("Created a 2 mm by 3 mm by 4 mm triangle.");
        System.out.println(VALID
            + testTriangle4.isValid());
        System.out.println(SPERIMETER
            + testTriangle4.semiPerimeter() + MM);
        System.out.println(AREA + testTriangle4.area() + MM2);
        System.out.println(TYPE + testTriangle4.getType());
        System.out.println(ANGLE1 + testTriangle4.angle(1) + RAD);
        System.out.println(ANGLE2 + testTriangle4.angle(2) + RAD);
        System.out.println(ANGLE3
            + testTriangle4.angle(MAGIC3) + RAD);

        System.out.println("");

        final Triangle testTriangle5 = new Triangle(23, 4, 6);
        System.out.println("Created a 23 mm by 3 mm by 4 mm triangle.");
        System.out.println(VALID
            + testTriangle5.isValid());
        System.out.println(SPERIMETER
            + testTriangle5.semiPerimeter() + MM);
        System.out.println(AREA + testTriangle5.area() + MM2);
        System.out.println(TYPE + testTriangle5.getType());
        System.out.println(ANGLE1 + testTriangle5.angle(1) + RAD);
        System.out.println(ANGLE2 + testTriangle5.angle(2) + RAD);
        System.out.println(ANGLE3
            + testTriangle5.angle(MAGIC3) + RAD);

        System.out.println("");

        System.out.println("\nDone.");
    }
}

