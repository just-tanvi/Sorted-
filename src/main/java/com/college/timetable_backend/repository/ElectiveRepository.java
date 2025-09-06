package com.college.timetable_backend.repository;

import com.college.timetable_backend.model.Elective;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ElectiveRepository extends JpaRepository<Elective, Long> {
    List<Elective> findByType(String type);
    List<Elective> findByDepartment(String department);
}
