package Homeworks;

public class DuimToMetr {
    public static void main(String[] args) {
        final double DUIM_PER_FOOT = 12;
        final double METERS_PER_DUIM = 0.0254;

        for (int inches = 1; inches <= 12 * DUIM_PER_FOOT; inches++) {
            double meters = inches * METERS_PER_DUIM;

            System.out.println(inches + " дюймам соответствует " + meters + " метров");

            if (inches % 12 == 0) {
                System.out.println();
            }
        }
    }
}
