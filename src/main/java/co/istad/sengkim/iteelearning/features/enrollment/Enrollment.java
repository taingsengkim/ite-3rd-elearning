package co.istad.sengkim.iteelearning.features.enrollment;

import co.istad.sengkim.iteelearning.features.course.Course;
import co.istad.sengkim.iteelearning.features.student.Student;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.valves.StuckThreadDetectionValve;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "enrollments")
public class Enrollment {
    @Id
    private Integer id;
    private LocalDateTime enrolledAt;
    private LocalDateTime paymentAt;
    private String paymentMethod;
    private Boolean paymentStatus;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
