public class TortburchakMaydoni {
    public static void main(String[] args) {
        System.out.println(calculator(5, 10)); // int
        System.out.println(calculator(3.5, 7.2)); // double
    }

    public static String calculator(double length, double width) {
        if (length <= 0 || width <= 0) {
            return "Xato: uzunlik va kenglik musbat sonlar bo‘lishi kerak";
        }

        double area = length * width;

        if (length % 1 == 0 && width % 1 == 0) {
            return "Maydon: " + (int) area;
        } else {
            return String.format("Maydon: %.2f", area);
        }
    }
}
