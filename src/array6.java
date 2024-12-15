
public class array6 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(8);
            }
        }



        //Pyramid pattern using nested loops
        int rows = 5; // Number of rows for the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars for the pyramid
            for (int z = 1; z <= (2 * i - 1); z++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
        System.out.println();




        // Pyramid another pattern.
        int rows2 = 5; // Number of rows for the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars for the pyramid
            for (int z = 1; z <= i ; z++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
        //Methods.yuram(); // this is how to jone  or call the method to anothere file.
    }
}
