import java.util.Random;

public class Ball {
    private int kicks = 0;
    private static Ball instance = new Ball();
    private String side = "";
    private  int limit;

    private Ball() {
        limit = 5 + new Random().nextInt(10);
    }

    static Ball getBall() {
        return instance;
    }

    synchronized void kick(String side) {
        kicks++;
        this.side = side;
        System.out.println(kicks + " " + side);
    }

    String getSide() {
        return side;
    }

    boolean isInGame() {
        return (kicks < limit);
    }
}