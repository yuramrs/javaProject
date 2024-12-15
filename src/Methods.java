import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //yuram();
        //System.out.println(number(7, 1 ));
        //System.out.println(zarb(85 , 69));
        //age();
        //System.out.println(factorial(5));
        //System.out.println(circleArea(2));
        //System.out.println(circleCircumference(5));
        Methods methods = new Methods();// this is the way to create objects for our class.
        //System.out.println(methods.maxFinder(6, 10));
        //System.out.println(methods.evenChecker(4));
        //System.out.println(methods.evenCheckerAll(2, 4, 5, 8));
    }
    // void is the return type
    // when we dont return anything we use void
    public static void yuram(){
        System.out.println("yuram is here");
    }
    private static int number(int x, int y){
        int result = x + y;
        return result;
    }
    public static int zarb(int x, int y){
        int result = x * y;
        return result;
    }
    public static int age(){
        Scanner input = new Scanner(System.in);
        System.out.println("how old are you: ");
        int age = input.nextInt();
        System.out.println("thank you");
        System.out.println(age);
        return age;
    }
    public static int factorial(int num){
        if (num == 0)// base case , this wont change
            return 1;
        return num * factorial(num - 1);
    }

    public static double circleArea(int radius){
        double result = radius * radius * Math.PI;
        return result;
    }

    public static double circleCircumference(int radius){
        double result = radius * 2 * Math.PI;
        return result;
    }


    public int maxFinder(int a, int b){
        return (a > b) ? a : b;
    }
    public boolean evenChecker(int n){
        return n % 2 == 0 ? true : false;
    }
    public boolean evenCheckerAll(int a, int b, int c, int d){
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                if (c % 2 == 0) {
                    if (d % 2 == 0) {
                        return true;
                    } else
                        return false;
                } else
                    return false;
            } else
                return false;
        } else
            return false;
    }
}
