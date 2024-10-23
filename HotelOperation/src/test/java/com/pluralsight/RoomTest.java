package com.pluralsight;

import org.junit.Assert;
import org.junit.Test;

public class RoomTest {
    Room room = new Room(1,500, false,false);
    @Test
    public void room_checkIn_getOccupied(){

        room.checkIn();

        Assert.assertTrue("Room should be assumed dirty after check in ",room.isDirty());
        Assert.assertTrue("Room should be occupied after check in ",room.isOccupied());
        Assert.assertFalse("Room should not be available after check in ",room.isAvailable());
    }
    @Test
    public void room_checkOut_available(){

        room.checkIn();

        Assert.assertTrue("Room should be assumed dirty after check in ",room.isDirty());
        Assert.assertTrue("Room should be occupied after check in ",room.isOccupied());
        Assert.assertFalse("Room should not be available after check in ",room.isAvailable());
        room.checkOut();
        Assert.assertFalse("Room should not be occupied after check-out",room.isOccupied());
        Assert.assertFalse("Room should not be dirty after check-out",room.isDirty());
        Assert.assertTrue("Room should  be available after check-out",room.isAvailable());
    }




}