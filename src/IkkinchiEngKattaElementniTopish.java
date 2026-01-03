public class IkkinchiEngKattaElementniTopish {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8, 6};

        String result = IkkinchiEngKattaElement(arr);
        System.out.println(result);
    }

    public static String IkkinchiEngKattaElement(int[] arr) {
        if (arr == null || arr.length < 2) {
            return "Ikkinchi eng katta element topilmadi";
        }

        Integer max = null;
        Integer max2 = null;

        for (int num : arr) {
            if (max == null || num > max) {
                if (max != null && num != max) {
                    max2 = max;
                }
                max = num;
            } else if (num != max && (max2 == null || num > max2)) {
                max2 = num;
            }
        }

        if (max2 == null) {
            return "Ikkinchi eng katta element topilmadi";
        }

        return "Ikkinchi eng katta element: " + max2;
    }
}
