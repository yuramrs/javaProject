public class Arrays2 {
    public static void main(String[] args) {
        //when arrays length is a number "n" then the possion starts from 0 to "n-1"
        int[] numbers = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5};
        int len = numbers.length;
        int p = -1;
        int c = 0;
        int[] numbers2 = new int[5];


//{1, 2, 3, 4, 5}
        for (int i = 0; i < len; i++) {
            if (numbers[i] != p) {
                numbers2[c] = numbers[i];
                c++;
                p = numbers[i];
            }
        }

        int newLen = numbers2.length;
        for (int i = 0; i < newLen; i++) {
            System.out.println(numbers2[i]);
        }
    }
}
