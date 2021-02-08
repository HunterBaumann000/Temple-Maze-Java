package edu.wctc;
import java.util.ArrayList;
import java.util.;


abstract class Room {
    //declarations
    String name;

    double randomRoom = (Math.random() * Math.floor(4));
    double randomCardinality = (Math.random() * Math.floor(5));

    List<String> roomNames = new ArrayList<String>();
        roomNames.add("There's strange engravings on this room's wall");
        roomNames.add("This room is filled with cobwebs");
        roomNames.add("this room has no light source");
        roomNames.add("This room is hard to breath in");
        roomNames.add("The sand covers a lot of this room");

    //room objects
    Room north = new Room();
    Room south = new Room();
    Room east = new Room();
    Room west = new Room();
    Room up = new Room();
    Room down = new Room();

    List<String> roomCardinality = new ArrayList<String>();
        roomCardinality.add("north");
        roomCardinality.add("south");
        roomCardinality.add("east");
        roomCardinality.add("west");
        roomCardinality.add("up");
        roomCardinality.add("down");


    public Room(String name) {
        room = roomNames[randomRoom];
    }

    public abstract String getDescription();

    public getAdjoiningRoom(char direction) {
        return roomCardinality[randomCardinality];
    }

    public String getExit() {
        return roomCardinality[randomCardinality];
    }

    public String getName() {
        return name;
    }

    public boolean isValidDirection(char direction) {
        //
    }

    //setters for directions
    public void setNorth(Room room) {
        Room.north = north;
    }
    public void setEast(Room room) {
        Room.east = east;
    }
    public void setSouth(Room room) {
        Room.south = south;
    }
    public void setWest(Room room) {
        Room.west = west;
    }
    public void setUp(Room room) {
        Room.up = up;
    }
    public void setDown(Room room) {
        Room.down = down;
    }
}
