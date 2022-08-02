import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private final Field field = new Field();
    private final Scanner scanner = new Scanner(System.in);
    private Figure figure;
    public void start() {
        userStep();
        pcStep();
        System.out.println(getWinner());


    }

    private void userStep (){
        //

        String s1 = scanner.nextLine();
        field.setP1Figure(s1);
    }

    private void pcStep (){
        //

        String s1 = scanner.nextLine();
        field.setP2Figure(s1);
    }

    private String getWinner() {

        return "HUMAN";
    }
}
