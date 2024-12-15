public class Array2D1 {
    public static void main(String[] args) {
        // declaring 2D Arrays.
        // this is the Array with 3 rows and 4 columns.
        int[][] numbers = new int[3][4];
        // any Arrays name.length in 2D Array is the number of rows.
        //System.out.println(numbers.length);
        //System.out.println(numbers[2].length);
        int k = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = k;
                System.out.print(numbers[i][j] + " ");
                k++;
            }
            System.out.println();
        }
    }
}
