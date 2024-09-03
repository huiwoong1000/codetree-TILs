import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Date> dateList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String strDate = sc.next();
            String day = sc.next();
            String weather = sc.next();

            if (weather.equals("Rain")) {
                dateList.add(new Date(strDate, day, weather));
            }
        }

        dateList.sort(null);
        dateList.get(0).printInfo();
    }
}

class Date implements Comparable<Date> {

    private LocalDate date;
    private String day;
    private String weather;

    public Date(String date, String day, String weather) {
        this.date = LocalDate.parse(date);
        this.day = day;
        this.weather = weather;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void printInfo() {
        System.out.println(this.date + " " + this.day + " " + this.weather);
    }

    @Override
    public int compareTo(Date d) {
        return this.date.compareTo(d.getDate());
    }
}