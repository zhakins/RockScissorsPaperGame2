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
    public static Figure getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
