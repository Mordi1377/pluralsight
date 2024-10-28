package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testCheckIn() {
        Room room = new Room(2, 100, false, false);
        assertTrue(room.checkIn());
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    void checkIn_dirtyRoom_failure() {
        Room room = new Room(2, 100, false, true);
        assertFalse(room.checkIn()); // Should fail to check in due to the room being dirty
    }

    @Test
    void checkIn_occupiedRoom_failure() {
        Room room = new Room(2, 100, true, false);
        assertFalse(room.checkIn()); // Should fail to check in due to the room being occupied
    }

    @Test
    void checkout_occupiedRoom_successful() {
        Room room = new Room(2, 100, true, true);
        room.checkOut(); // Check out the room
        assertFalse(room.isOccupied());
    }

    @Test
    void checkout_availableRoom_failure() {
        Room room = new Room(2, 100, false, false);
        assertThrows(IllegalStateException.class, room::checkOut);
    }

    @Test
    void cleanRoom_dirtyRoom_successful() {
        Room room = new Room(2, 100, false, true);
        room.cleanRoom();
        assertFalse(room.isDirty());
    }
}
