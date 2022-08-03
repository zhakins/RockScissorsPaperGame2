import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private final Field field = new Field();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {

        userStep();
        pcStep();
        System.out.println(getWinner());


    }

    private void userStep (){
        //
        System.out.println("1¬ведите значение 1-3");
        String s1 = scanner.nextLine();
        field.setP1Figure(s1);
    }

    private void pcStep (){
        //

        // String s1 = scanner.nextLine();
         String s1 = "ROCK";
        //Figure figure = Figure.randomFigure();
        //String s1 = (String)figure;
        field.setP2Figure(s1);
    }

    private String getWinner() {
        String s1 = field.getP1Figure();
        String s2 = field.getP2Figure();
        if (true){
            return "ничь€";
        } else if (s1=="PAPER" && s2=="ROCK") {
            return "HUMAN";
        }
        else if (s1=="SCISSORS" && s2=="PAPER"){
            return "HUMAN";
        }
        else if (s1=="ROCK" && s2=="SCISSORS"){
            return "HUMAN";
        }
        return "Robot";
    }
}
