package com.hotel.management.controller;

import com.hotel.management.entity.Booking;
import com.hotel.management.service.BookingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService service;

    public BookingController(BookingService service) {
        this.service = service;
    }

    @PostMapping
    public Booking bookRoom(@RequestBody Booking booking) {
        return service.bookRoom(booking);
    }
}