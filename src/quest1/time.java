
package quest1;

public class time {
    private int hour;
    private int minute;
    private int second;
    private long timee;
    public time() {
        timee = System.currentTimeMillis();
    }
    public time(long t) {
        timee = t;
    }
    public time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void set_time(long e) {
        timee = e;
    }
    public int get_hour() {
        return (int)(timee / (1000 * 60 * 60)) % 24;
    }
    public int get_minute() {
        return (int)(timee / (1000 * 60)) % 60;
    }
    public int get_second() {
        return (int)(timee / 1000) % 60;
    }
}
