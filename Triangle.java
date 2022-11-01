/**
 * The Triangle Class.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2020-10-4
 */
class Triangle {
    /**
     * Side1 field.
     *
     * @param Side1 - Side
     */
    private int Side1;
    /**
     * Side2 field.
     *
     * @param Side2 - Side
     */
    private int Side2;
    /**
     * Side3 field.
     *
     * @param Side3 - Side
     */
    private int Side3;

    /**
     * The Constructor.
     *
     * @param Side1 - Side1 from user
     * @param Side2 - Side2 from user
     * @param Side3 - Side3 from user
     */
    Triangle(int Side1, int Side2, int Side3) {
        this.Side1 = Side1;
        this.Side2 = Side2;
        this.Side3 = Side3;
    }

    // getters
    public int getSide1() {
        return this.Side1;
    }

    public int getSide() {
        return this.Side2;
    }

    public int getSide3() {
        return this.Side3;
    }

    /**
     * The perimeter() function.
     *
     * @return peri - perimeter
     */
    private int perimeter() {
        final int peri;

        if (this.isValid()) {
            peri = this.Side1 + this.Side2 + this.Side3;
        } else {
            peri = -1;
        }
        return peri;
    }

    /**
     * The isValid() function.
     *
     * @return valid - valid
     */
    public boolean isValid() {
        boolean valid = false;
        final int[] sides = {this.Side1, this.Side2, this.Side3};
        valid = sides[0] + sides[1] > sides[2];

        return valid;
    }

    /**
     * The area() function.
     *
     * @return area - area
     */
    public double area() {
        final int semi = this.semiPerimeter();
        final double area = Math.sqrt(
            semi * (semi - this.Side1)
            * (semi - this.Side2) * (semi - this.Side3));
        return area;
    }

    /**
     * The getType() function.
     *
     * @return triangle - triangle
     */
    public String getType() {
        String triangle = "";
        if (this.Side1 == this.Side2 && this.Side2 == this.Side3) {
            triangle = "Equilateral Triangle";
        } else if (this.Side1 == this.Side2 && this.Side1 != this.Side3
            || this.Side2 == this.Side3 && this.Side2 != this.Side1
            || this.Side3 == this.Side1 && this.Side3 != this.Side2
        ) {
            triangle = "Isoceles Triangle";
        } else {
            final double[] allAngles =
            {this.angle(1), this.angle(2), this.angle(3)};
            boolean angleCheck = false;

            final int number180 = 180;
            final int number90 = 90;
            for (int count = 0; count < allAngles.length; count++) {
                if (allAngles[count] * (number180 / Math.PI) == number90) {
                    angleCheck = true;
                    break;
                }
            }

            if (angleCheck) {
                triangle = "Right Angle";
            } else {
                triangle = "Scalene";
            }
        }
        return triangle;
    }

    /**
     * The semiPerimeter() function.
     *
     * @return sPerimeter - sPerimeter
     */
    public int semiPerimeter() {
        final int sPerimeter;
        if (this.isValid()) {
            sPerimeter = this.perimeter() / 2;
        } else {
            sPerimeter = -1;
        }
        return sPerimeter;
    }

    /**
     * The angle() function.
     *
     * @param angleNumber -  number
     * @return radianAngles - angles
     */
    public double angle(int angleNumber) {
        final int number4 = 4;
        if (this.isValid() && angleNumber > 0 && angleNumber < number4) {
            final double[] radianAngles = {
            Math.acos(
                (Math.pow(this.Side1, 2)
                + Math.pow(this.Side2, 2)
                - Math.pow(this.Side3, 2))
                / (2 * this.Side1 * this.Side2)),
            Math.acos(
                (Math.pow(this.Side2, 2)
                 + Math.pow(this.Side3, 2)
                 - Math.pow(this.Side1, 2))
                / (2 * this.Side2 * this.Side3)),
            Math.acos(
                (Math.pow(this.Side3, 2)
                 + Math.pow(this.Side1, 2)
                 - Math.pow(this.Side2, 2))
                / (2 * this.Side3 * this.Side1)),
            };
            return radianAngles[angleNumber - 1];
        } else {
            return -1;
        }
    }
}
