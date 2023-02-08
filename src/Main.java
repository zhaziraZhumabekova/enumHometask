import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputWeekDay = sc.nextLine();

        Week week = Week.valueOf(inputWeekDay.toUpperCase());
        switch (week) {
            case MONDAY -> System.out.println("Duyshombu kunu java sabagyn okuymun");
            case TUESDAY -> System.out.println("Sheyshembi kunu english sabak bolot");
            case WEDNESDAY -> System.out.println("Sharshembi kunu java sabak bolot");
            case THURSDAY -> System.out.println("Beyshembi kunu java boyuncha practice bolot");
            case FRIDAY -> System.out.println("Juma kunu java sabagyn okuymun");
            case SATURDAY -> System.out.println("Ishembi kunu practice bolot");
            case SUNDAY -> System.out.println("Jekshembi kunu es aluu, ech kanday sabak jok");
        }

    }
}