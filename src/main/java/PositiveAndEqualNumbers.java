public class PositiveAndEqualNumbers {

    int a;
    int b;
    int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public PositiveAndEqualNumbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PositiveAndEqualNumbers() {
    }

    public void checkForPositiveNumber(){
        if (a >= 0){
            System.out.printf("The number %d is positive.%n",a);
        }else {
            System.out.printf("The number %d is negative.%n",a);
        }if (b >= 0){
            System.out.printf("The number %d is positive.%n",b);
        }else {
            System.out.printf("The number %d is negative.%n",b);
        }if (c >= 0){
            System.out.printf("The number %d is positive.%n",c);
        }else {
            System.out.printf("The number %d is negative.%n",c);
        }
    }

    public void checkForEquality(){
        if (a == b && b == c){
            System.out.println("The numbers are equal.");
        }else {
            System.out.println("The numbers are not equal.");
        }
    }
}
