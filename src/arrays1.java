public class arrays1 {
    public static void main(String[] args) {

        //1. Array = used to store multiple values in a single variable
        //2. when we want to determine array size we use arrays name . length
        //3. arrays position (subscript) always starts with 0


            //int[] numbers = {1, 2, 3, 4, 5, 6};
            
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            //System.out.println(numbers[i]);
        }

        //for (int i = 0; i < numbers.length; i++) {
            //System.out.println(numbers[i]);
        //}


// this is used for copying one arrays element to the other
        int[] numbers1 = new int[6];
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = numbers[i];
            //System.out.println(numbers1[i]);
        }

// this is for calculating arrays size
        //System.out.println(numbers1.length);


// this is for summing arrays elements
        int sum = 0;
        for (int i = 0; i < numbers1.length; i++) {
            sum += numbers1[i];
        }
        //System.out.println(sum);


        int max = numbers1[0];
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] > max)
                max = numbers1[i];
        }
        //System.out.println(max);
    }
}
