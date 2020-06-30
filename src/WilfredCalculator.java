import java.util.Calendar;

public class WilfredCalculator {
    public int getCurrentAge(final int yob) {
        final Calendar calendar = Calendar.getInstance();
        final int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - yob;
    }
}
