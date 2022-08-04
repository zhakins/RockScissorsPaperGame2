import java.util.Scanner;

public class GameLogic {
    private final Field field = new Field();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {

        userStep();
        pcStep();
        System.out.println(getWinner());


    }

    private void userStep() {
        //
        System.out.println("ROCK");
        System.out.println("SCISSORS");
        System.out.println("PAPER");
        String s1 = scanner.nextLine();
        field.setP1Figure(s1);
    }

    private void pcStep() {
        //

        //String s1 = scanner.nextLine();
        //String s1 = "ROCK";
        Figure figure = Figure.randomFigure();
        String s1 = String.valueOf(figure);
        field.setP2Figure(s1);
    }

    private String getWinner() {
        String s1 = field.getP1Figure();
        String s2 = field.getP2Figure();
        if (s1.equals(s2)) {
            return "ничья: " + "Robot " + s1 + " Human " + s2;
        } else if (s1.equals("PAPER") && s2.equals("ROCK")) {
            return "Winner HUMAN: " + s2 + " Robot " + s1;
        } else if (s1.equals("SCISSORS") && s2.equals("PAPER")) {
            return "Winner HUMAN: " + s2 + " Robot " + s1;
        } else if (s1.equals("ROCK") && s2.equals("SCISSORS")) {
            return "Winner HUMAN: " + s2 + " Robot " + s1;
        }
        return "Winner Robot: " + s1 + " HUMAN " + s2;
    }
}
