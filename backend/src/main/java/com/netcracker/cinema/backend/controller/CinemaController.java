package com.netcracker.cinema.backend.controller;

import com.netcracker.cinema.backend.DTO.FullDTO.FullCinemaDTO;
import com.netcracker.cinema.backend.entity.Cinema;
import com.netcracker.cinema.backend.entity.Hall;
import com.netcracker.cinema.backend.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cinemas")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public List<Cinema> findAllCinemas() {
        return cinemaService.findAll();
    }

    @GetMapping(params = {"id"})
    public Cinema findCinemaById(@RequestParam Long id) {
        return cinemaService.findById(id).get();
    }

    @PostMapping
    public FullCinemaDTO saveCinema(@RequestBody Cinema cinema) {
        Cinema savedCinema = cinemaService.save(cinema);
        FullCinemaDTO fullCinemaDTO = new FullCinemaDTO(savedCinema);
        return fullCinemaDTO;
    }

    @DeleteMapping(params = {"id"})
    public void deleteCinemaById(@RequestParam Long id) {
        cinemaService.deleteById(id);
    }

    @GetMapping(params = {"id"}, path = {"/full"})
    public FullCinemaDTO findFullCinemaById(@RequestParam Long id) {
        Cinema cinema = cinemaService.findById(id).get();
        FullCinemaDTO fullCinemaDTO = new FullCinemaDTO(cinema);
        return fullCinemaDTO;
    }

    @GetMapping(params = {"id"}, path = {"/halls"})
    public List<Hall> findHallsByCinemaId(@RequestParam Long id) {
        return cinemaService.findById(id).get().getHalls();
    }

}
