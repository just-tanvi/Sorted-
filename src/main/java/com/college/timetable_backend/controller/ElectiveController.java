package com.college.timetable_backend.controller;
import com.college.timetable_backend.model.Elective;
import com.college.timetable_backend.repository.ElectiveRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/electives")
public class ElectiveController {

    private final ElectiveRepository repository;

    public ElectiveController(ElectiveRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Elective> getAllElectives() {
        return repository.findAll();
    }

    @PostMapping
    public Elective addElective(@RequestBody Elective elective) {
        return repository.save(elective);
    }

    @GetMapping("/type/{type}")
    public List<Elective> getByType(@PathVariable String type) {
        return repository.findByType(type);
    }

    @GetMapping("/department/{department}")
    public List<Elective> getByDepartment(@PathVariable String department) {
        return repository.findByDepartment(department);
    }
}
