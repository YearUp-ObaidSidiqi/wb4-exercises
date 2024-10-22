package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numbersOfNights;
    private boolean weekend;
    private double perdayPrice;
    private boolean isRoomKingSize;

    public Reservation (String roomType,double perdayPrice, int numbersOfNights, boolean isWeekend){
        this.roomType = roomType;
        this.numbersOfNights = numbersOfNights;
        this.weekend =isWeekend;
        this.perdayPrice = perdayPrice;
    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public double getPrice(){
        return this.perdayPrice;
    }

    public int getNumberOfNights(){
        return this.numbersOfNights;
    }

    public boolean isRoomKingSize() {
        return isRoomKingSize;
    }


    public boolean isWeekend(){
        return weekend;
    }


}
