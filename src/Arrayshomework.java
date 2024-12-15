public class Arrayshomework {
    public static void main(String[] args) {
        /*int[] numbers = {3, 6, 7, 2, 9};
        int evennum = 0;
        int oddnum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evennum++;
            }else {
                oddnum++;
            }
        }
        System.out.println("odd = " + oddnum + " , even = " + evennum);
         */





        // this is how to target
        /*int[] number = {1, 3, 5, 7};
        int target = 3;
        boolean num = false;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == target){
                num= true;
            }
        }
        //System.out.println(num);
         */




        /*int[] number = {2, 3, 2, 2, 5};
        int target = 2;
        int start = 0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == target)
            {
                start++;
            }
        }
        System.out.println(start);
         */


        int[] numbers = {1, 3, 5};
        int[] numbers2 = {2, 4, 6};
        int m = numbers.length - 1;
        int n = numbers2.length - 1;
        int[] nums = new int[numbers.length + numbers2.length]; // Correct size
        int p = nums.length - 1; // Start from the last index of nums
//{,4,5,6}
        while (m >= 0 && n >= 0) {
            if (numbers[m] > numbers2[n]) {
                nums[p] = numbers[m];
                m--;
            } else {
                nums[p] = numbers2[n];
                n--;
            }
            p--;
        }

        // Handle remaining elements in numbers
        /*while (m >= 0) {
            nums[p] = numbers[m];
            m--;
            p--;
        }

        // Handle remaining elements in numbers2
        while (n >= 0) {
            nums[p] = numbers2[n];
            n--;
            p--;
        }
         */

        // Print the merged array
        System.out.println("Merged Array: " + java.util.Arrays.toString(nums));
    }
}
