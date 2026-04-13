package com.hotel.management.controller;

import com.hotel.management.entity.Room;
import com.hotel.management.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService service;

    public RoomController(RoomService service) {
        this.service = service;
    }

    @PostMapping
    public Room addRoom(@RequestBody Room room) {
        return service.addRoom(room);
    }

    @GetMapping("/available")
    public List<Room> getAvailableRooms() {
        return service.getAvailableRooms();
    }
}