public class Test {

    public static void main(String[] args) {

        Numbers setOfNumbers1 = new Numbers(1, 2, 3);
        setOfNumbers1.checkForPositiveNumber();
        setOfNumbers1.checkForEquality();

        Numbers setOfNumbers2 = new Numbers();
        setOfNumbers2.setA(4);
        setOfNumbers2.setB(-4);
        setOfNumbers2.setC(0);
        setOfNumbers2.checkForPositiveNumber();
        setOfNumbers2.checkForEquality();

        Numbers setOfNumbers3 = new Numbers(9, 9, 9);
        setOfNumbers3.checkForPositiveNumber();
        setOfNumbers3.checkForEquality();

        Numbers average = new Numbers();
        average.setA(7);
        average.setB(6);
        average.calculateAverage(average.a, average.b);
        average.calculateSum(average.a, average.b);
    }
}
