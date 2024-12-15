import java.util.Arrays;

public class arrays3 {
    public static void main(String[] args) {
        //the first part of array that you are giving instructions or giving infos
        int[] numbers = {1, 1, 1, 2, 2, 2, 3, 3, 4};
        int len = numbers.length;
        int a = -1;
        int b = 0;
        int[] numbers2 = new int[4];

        //the second part of arraya witch is forloop and if
        for (int i = 0; i < len; i++) {
            if (numbers[i] != a){
                numbers2[b] = numbers[i];
                b++;
                a = numbers[i];
            }
        }

        //the last part of
        int newlen = numbers2.length;
        for (int i = 0; i < newlen; i++) {
            //System.out.println(numbers2[i]);
        }
        int[] x = {1, 2, 3, 4, 5};
        int size = x.length;
        int start = 0;
        int end = size - 1;
        for (int i = 0; i < size; i++) {
            int temp = 0;
            temp = x[start];
            x[start] = x[end];
            x[end] = temp;
            start++;
            end--;
        }
        for (int num : x){
            System.out.print(num + " ");
        }
    }
}
