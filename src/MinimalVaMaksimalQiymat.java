public class MinimalVaMaksimalQiymat {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8, 6};
        System.out.println(maxMin(arr));
    }

    public static String maxMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Xato: massiv bo'sh");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        return "Minimal: " + min + ", Maksimal: " + max;
    }
}
