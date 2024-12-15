public class forloop2 {
    public static void main(String[] args) {
        /*
        for (int x = 1 ; x <= 100 ; x++) {
            System.out.println(x);
        }
        */

        int sum = 0;
        for (int Y = 1; Y <= 100; Y++){
            //sum = Y + sum;
            sum += Y;
        }
        //System.out.println(sum);


        int zarb = 0;
        for (int i = 1; i<= 2000; i++){
            zarb *= i;
            //zarb = i * zarb;
        }
        //System.out.println(zarb);

        int num = 123;
        int reversed = 0;
        while (0 < num){
            int digit = num % 10;
            num = num / 10;
            reversed = reversed * 10 + digit;
        }
        //System.out.println(reversed);

        //Scanner input = new Scanner(System.in);
        //System.out.println("enter a number: ");
        //int adad = input.nextInt();
        //int jam = 0;
        //while (0 < adad){
            //int digit = adad % 10;
            //adad = adad / 10;
            //jam = jam + digit;
        //}
        //System.out.println(jam);

        int a = 30;
        int b = 40;
        int c = 50;
        int d = 0;
        d = c;
        c = b;
        b = d;
        //System.out.println(b);
        //System.out.println(c);

        int bigger = Math.max(a, b);
        int biggest = Math.max(c, bigger);
        System.out.println(biggest);
        for (int i = biggest; i >=0 ; i--) {
            System.out.println(i);
        }
        }
    }
//arrays