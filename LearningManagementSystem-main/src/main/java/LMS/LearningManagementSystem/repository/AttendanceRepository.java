package LMS.LearningManagementSystem.repository;

import LMS.LearningManagementSystem.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer>{
}

