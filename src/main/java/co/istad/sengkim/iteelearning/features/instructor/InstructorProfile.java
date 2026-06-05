package co.istad.sengkim.iteelearning.features.instructor;


import co.istad.sengkim.iteelearning.features.course.Course;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "instructor_profiles")
public class InstructorProfile {
    @Id
    private String userId;
    private String biography;
    private String facebookLink;
    private String githubLink;
    private String jobTitle;
    private String phoneNumber;

    @OneToMany(mappedBy = "instructorProfile")
    private List<Course> courses;
}
