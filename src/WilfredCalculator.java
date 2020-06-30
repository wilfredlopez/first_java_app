import java.util.Calendar;

public class WilfredCalculator {
    public int getCurrentAge(int yob) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - yob;
    }
}
