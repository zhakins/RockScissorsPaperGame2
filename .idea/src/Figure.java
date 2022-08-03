import java.util.Random;
public enum Figure {
    ROCK(1),
    SCISSORS(2),
    PAPER(3);
    private int val;
    Figure(int value) {
    this.val =value;
    }

    public int getVal() {
        return val;
    }
    private static final Random PRNG = new Random();
    private static Figure[] figures = values();
    public static Figure randomFigure()  {
        //Figure[] figures = figures.values();
        return figures[PRNG.nextInt(figures.length)];
    }
}
