public class Test {

    public static void main(String[] args) {

        Numbers setOfNumbers1 = new Numbers(1, 2, 3);
        setOfNumbers1.checkForPositiveNumber();
        setOfNumbers1.checkForEquality();

        Numbers setOfNumbers2 = new Numbers();
        setOfNumbers2.setA(-4);
        setOfNumbers2.setB(-4);
        setOfNumbers2.setC(-4);
        setOfNumbers2.checkForPositiveNumber();
        setOfNumbers2.checkForEquality();

//        Numbers setOfNumbers3 = new Numbers(9, 9, 9);
//        setOfNumbers3.checkForPositiveNumber();
//        setOfNumbers3.checkForEquality();

        System.out.println(calculateAverage(6,23));

        System.out.println(calculateSum(calculateAverage(3, 6), calculateAverage(5, 9)));

        System.out.println("Please enter password.");
        PasswordValidation newPass = new PasswordValidation();
        newPass.validatePassword();
        }

        public static double calculateAverage(double a, double b){
            return (a + b)/2;
        }

        public static double calculateSum(double a, double b){
            return a + b;
        }
    }


