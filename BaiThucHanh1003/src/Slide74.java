public class Slide74 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 4, 7 };
        int sum = 0;

        // tính tổng các số chẵn trong mảng
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        // in tổng các số chẵn trong mảng
        System.out.println("Tổng các số chẵn trong mảng là: " + sum);
    }
}

