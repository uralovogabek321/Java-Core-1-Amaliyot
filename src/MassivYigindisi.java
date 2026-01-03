public class MassivYigindisi {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8, 6};
        System.out.println("Yig'indi: " + yigindi(arr));
    }

    public static long yigindi(int[] arr) {
        long sum = 0;
        if (arr != null) {
            for (int num : arr) {
                sum += num;
            }
        }
        return sum;
    }
}
