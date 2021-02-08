package edu.wctc;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        new Player();
        Maze maze = new Maze();

        String userInput = scanner.nextLine();


        while(isFinished()) {

            System.out.println(maze.getCurrentRoomDescription);

            System.out.println(maze.getCurrentRoomExits);

            System.out.println("What would you like to do?");

            return maze.move(userInput);

            if (!isFinished()) {
                System.out.println(player.score);
                break;
            } else {
                continue;
            }
        }
    }
}
