public class Numbers {

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

    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Numbers() {
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
        }if (a >= 0 && b >= 0 && c >= 0){
            System.out.println("All numbers are positive.");
        }else {
            System.out.println("Not all numbers are positive.");
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
