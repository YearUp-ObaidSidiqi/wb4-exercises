package com.pluralsight;

public class Hotel {
    private final String name;
    private final int numberOfRooms;
    private int bookedRooms;
    private final int numberOfSuites;
    private int bookedSuites;

    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if ((this.numberOfSuites - this.bookedSuites) >= numberOfRooms) {
                this.bookedSuites += numberOfRooms;
                System.out.println("Successfully booked " + numberOfRooms + " suite(s).");
                return true;
            } else {
                System.out.println("Not enough suite(s) available.");
                return false;
            }
        } else {
            if ((this.numberOfRooms - this.bookedRooms) >= numberOfRooms) {
                this.bookedRooms += numberOfRooms;
                System.out.println("Successfully booked " + numberOfRooms + " room(s).");
                return true;
            } else {
                System.out.println("Not enough room(s) available.");
                return false;
            }
        }
    }

    public int getAvailableRooms(){
        return this.numberOfRooms-bookedRooms;
    }

    public int getAvailableSuites(){
        return this.numberOfSuites-bookedSuites;
    }

    public void printInventory(){
        int totalInventory = this.getAvailableSuites() + this.getAvailableRooms();
        System.out.println("Total available rooms and suites: " + totalInventory);
        System.out.println("Available suites: " + getAvailableSuites());
        System.out.println("Available rooms: " + getAvailableRooms());
    }

}
