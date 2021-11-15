
package quest1;

public class Quest1 {

    public static void main(String[] args) {
        time time1 = new time();
        System.out.printf("%d:%d:%d%n",time1.get_hour(),time1.get_minute(),time1.get_second());
        time1.set_time(555550000);
        System.out.printf("%d:%d:%d%n",time1.get_hour(),time1.get_minute(),time1.get_second());
    }
}


