package com.movie.ticket.booking.system.service.api;

import com.movie.ticket.booking.system.commons.dto.BookingDTO;
import com.movie.ticket.booking.system.service.BookingService;
import com.movie.ticket.booking.system.commons.constants.LoggerConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/bookings")
@Slf4j
public class BookingApi {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public BookingDTO createBooking(@RequestBody BookingDTO bookingDTO) {
        log.info(LoggerConstants.ENTERED_CONTROLLER_MESSAGE.getValue(), "createBooking",
                this.getClass(), bookingDTO.toString());
        return this.bookingService.createBooking(bookingDTO);
    }



}
