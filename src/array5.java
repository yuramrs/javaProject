public class array5 {
    public static void main(String[] args) {
        // 
        int[] numbers = {2, 3, 2, 2, 5};
        int len = numbers.length;
        int candidate = -1;
        int c = 0;

        for (int i = 0; i < len; i++) {
            if (c == 0){
                candidate = numbers[i];
            }
            if (candidate == numbers[i]){
                c++;
            }
            else {
                c--;
            }
        }
        System.out.println(candidate);
    }
}
