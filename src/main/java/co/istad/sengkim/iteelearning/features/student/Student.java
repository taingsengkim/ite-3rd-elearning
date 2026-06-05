package co.istad.sengkim.iteelearning.features.student;

import co.istad.sengkim.iteelearning.features.enrollment.Enrollment;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.LifecycleState;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "student_profiles")
public class Student {
    @Id
    private String userId;
    private String biography;
    private String facebookLink;
    private String githubLink;
    private String major;
    private String phoneNumber;
    private String university;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}
