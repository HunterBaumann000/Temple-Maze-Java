package edu.wctc;

public class Maze {

    public String getCurrentRoomDescription;
    public String getCurrentRoomExits;
    boolean isFinished = false;


    Room currentRoom = new Room();
    Player player = new Player();


    Maze(Player player) {
        Player.player = currentRoom;
    }

    public String exitCurrentRoom() {
        if (currentRoom == exit) {
            return exit();
        } else {
            return "current room has no exits";
        }
    }

    public String interactWithCurrentRoom() {
        if (currentRoom == interactable) {
            return interact();
        } else {
            return "You couldn't find anything that stands out in this room";
        }
    }

    public String lootCurrentRoom() {
        if (currentRoom == lootable) {
            return loot();
        } else {
            return "This room has nothing but dust and sand";
        }
    }

    public Object move(char userInput) {
        if(userInput.equals('n')) {
            return currentRoom.setDown();

        } else if (userInput.equals('s')) {
            return currentRoom.setSouth();

        } else if (userInput.equals('e')) {
            return currentRoom.setEast();

        } else if (userInput.equals('w')) {
            return currentRoom.setWest();

        } else if (userInput.equals('u')) {
            return currentRoom.setUp();

        } else if (userInput.equals('d')) {
            return currentRoom.setDown();

        } else if (userInput.equals('i')) {
            return interactWithCurrentRoom();

        } else if (userInput.equals('l')) {
            return lootCurrentRoom();

        } else if (userInput.equals('x')) {
            return exitCurrentRoom();

        } else if (userInput.equals('v')) {
            return getPlayerInventory();
        }
    }

    public void getPlayerScore() {

        return getScore();
    }

    public void getPlayerInventory() {

        return getInventory();
    }

    public void getCurrentRoomExits() {

        return getExit();
    }

    public void getCurrentRoomDescription() {

        return getRoomDescription();
    }


    public boolean isFinished() {

        return isFinished;
    }

}
