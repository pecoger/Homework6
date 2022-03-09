public class Test {

    public static void main(String[] args) {

        PositiveAndEqualNumbers setOfNumbers1 = new PositiveAndEqualNumbers(1, 2, 3);
        setOfNumbers1.checkForPositiveNumber();
        setOfNumbers1.checkForEquality();

        PositiveAndEqualNumbers setOfNumbers2 = new PositiveAndEqualNumbers();
        setOfNumbers2.setA(4);
        setOfNumbers2.setB(-4);
        setOfNumbers2.setC(0);
        setOfNumbers2.checkForPositiveNumber();
        setOfNumbers2.checkForEquality();

        PositiveAndEqualNumbers setOfNumbers3 = new PositiveAndEqualNumbers(9, 9, 9);
        setOfNumbers3.checkForPositiveNumber();
        setOfNumbers3.checkForEquality();
    }
}
