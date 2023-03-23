import java.text.DecimalFormat;

public class RoundDeltaTest {
    static double result = 0.85;
    static double delta;

    public static void main(String[] args) {
        delta = calcDelta(result);
        roundDelta(delta);
    }

    public static double calcDelta(double result) {
        delta = result * 0.08;
        return delta;
    }

    public static void roundDelta(double delta) {
        if (delta > 3 & delta < 100) {
            DecimalFormat decimalFormat = new DecimalFormat("#");
            System.out.println("реузльтат: " + decimalFormat.format(result) + " " + "Погрешность: " + decimalFormat.format(delta));
        } else if (delta < 3 & delta > 0.3) {
            DecimalFormat decimalFormat = new DecimalFormat("#.#");
            System.out.println("реузльтат: " + decimalFormat.format(result) + " " + "Погрешность: " + decimalFormat.format(delta));
        } else if (delta < 0.3) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.println("реузльтат: " + decimalFormat.format(result) + " " + "Погрешность: " + decimalFormat.format(delta));
        } else if (delta > 100) {
            double roundDelta = Math.round(delta / 10) * 10;
            double roundResult = Math.round(result / 10) * 10;
            System.out.println("реузльтат: " + roundResult + " " + "Погрешность: " + roundDelta);
        }
    }
}