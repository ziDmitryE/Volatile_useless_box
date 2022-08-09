import java.util.Calendar;

import static java.lang.Thread.sleep;

public class Switch {

    private static volatile boolean val;
    private static final int TIME_CONST = 2000;
    private static int count = 0;

    public void switchOn() {
        System.out.println("игра началась \n" + Calendar.getInstance().getTime());
        try {
            for (int i = 0; i < 3; i++) {
                while (val) ;
                count++;
                System.out.println(count + ". " + Thread.currentThread().getName() + " включает тумблер");
                sleep(TIME_CONST);
                val = true;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void switchOff() {
        try {
            for (int i = 0; i < 3; i++) {
                while (!val) ;
                count++;
                System.out.println(count + ". " + Thread.currentThread().getName() + " выключает тумблер");
                sleep(TIME_CONST);
                val = false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("игра закончилась \n" + Calendar.getInstance().getTime());
    }
}
