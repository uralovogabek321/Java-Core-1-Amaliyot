public class MassivTartiblanganiniTekshirish {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9};
        System.out.println(isSortedAscending(arr));
    }

    public static boolean isSortedAscending(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
