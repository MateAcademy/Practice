package stream.ex01;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {
        MyFunc myFunc = x -> x * x;

        MyFunc<Integer> myFunc2 = new Lambda();

        System.out.println(myFunc.test(9));

        MyFunc<Integer> myFunc1 = new MyFunc() {
            @Override
            public double test(Integer integer) {
                return integer * integer;
            }
        };
        System.out.println(myFunc1.test(9));
    }

    private static class Lambda implements MyFunc<Integer> {
        @Override
        public double test(Integer a) {
            return a * a;
        }
    }
}
