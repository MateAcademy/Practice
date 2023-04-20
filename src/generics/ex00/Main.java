package generics.ex00;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
 //       Integer i = (Integer) (mult(5, 6));
 //       Double i2 =  (Double) (mult(5., 6));
        int i2 =  (mult(5., 6)).intValue();
        System.out.println(i2);
    }

    private static <T extends Number> T mult(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T)Double.valueOf(a.doubleValue() * b.doubleValue());
        }

        if (a instanceof Integer || b instanceof Integer) {
            return (T)Integer.valueOf(a.intValue() * b.intValue());
        }

        return null;
    }
}
