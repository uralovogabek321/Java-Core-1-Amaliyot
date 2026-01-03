import java.time.LocalDate;

public class YoshKalkulyatori {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1999, 5, 20);
        LocalDate currentDate = LocalDate.of(2023, 5, 3);
        System.out.println(calculator(birthDate, currentDate));
    }

    public static String calculator(LocalDate birthDate, LocalDate currentDate) {
        if (birthDate.isAfter(currentDate)) {
            return "Xato";
        }

        int years = currentDate.getYear() - birthDate.getYear();
        int months = currentDate.getMonthValue() - birthDate.getMonthValue();
        int days = currentDate.getDayOfMonth() - birthDate.getDayOfMonth();

        if (days < 0) {
            months--;
            days += 30;
        }

        if (months < 0) {
            years--;
            months += 12;
        }

        return "Yosh: " + years + " yil " + months + " oy " + days + " kun";
    }
}
