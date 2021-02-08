package edu.wctc;
import java.util.*;


public class Player {

    int score = 0;
    List<String> inventory = new ArrayList<String>();

    List<String> items = new ArrayList<String>();
        items.add("You found a golden chalice");
        items.add("You didn't find much, just old bones");
        items.add("You found a gold coin");
        items.add("You found a worn-out ring");
        items.add("You found a shiny necklace");

    public void addToInventory(String inventory) {

        inventory.add(newItem);
    }

    public void addToScore(int score) {

        return score++;
    }

    public String getInventory() {
        return List.inventory;
    }

    public int getScore() {

        return score;
    }


}
