public class Main {

    public static void main(String[] args) {

        Switch game = new Switch();

        new Thread(null, game::switchOn, "Пользователь").start();
        new Thread(null, game::switchOff, "Коробка").start();
    }
}
