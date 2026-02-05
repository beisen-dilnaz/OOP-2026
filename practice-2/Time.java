public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public final String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int h12 = hour % 12;
        if (h12 == 0) h12 = 12;
        String ampm = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", h12, minute, second, ampm);
    }

    public static Time add(Time t1, Time t2) {
        int totalSeconds = (t1.hour * 3600 + t1.minute * 60 + t1.second)
                            + (t2.hour * 3600 + t2.minute * 60 + t2.second);

        int hour = totalSeconds / 3600;
        totalSeconds %= 3600;
        int minute = totalSeconds / 60;
        int second = totalSeconds % 60;

        return new Time(hour % 24, minute, second);
    }
}