package com.hotel.management.service;

import com.hotel.management.entity.Room;
import com.hotel.management.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository repo;

    public RoomService(RoomRepository repo) {
        this.repo = repo;
    }

    public Room addRoom(Room room) {
        room.setAvailable(true);
        return repo.save(room);
    }

    public List<Room> getAvailableRooms() {
        return repo.findByAvailable(true);
    }
}
