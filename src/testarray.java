public class testarray {
    public static void main(String[] args) {
        // Q1
        int[] numbers = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 6, 6, 6, 6};
        int len = numbers.length;
        int a = -1;
        int b = 0;
        int[] numbers2 = new int[6];

        for (int i = 0; i < len; i++) {
            if (numbers[i] != a){
                numbers2[b] = numbers[i];
                b++;
                a = numbers[i];
            }
        }

        int newlen = numbers2.length;
        for (int i = 0; i < newlen; i++) {
            //System.out.println(numbers2[i]);
        }
        //Q2
        int[] x = {40, 80, 120, 160, 200};
        for (int i = 0; i < x.length; i++) {
            x[i] *= 5;
        }
        for (int num : x ){
            System.out.println(num + " ");
        }
    }
}
