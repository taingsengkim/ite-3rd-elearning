package co.istad.sengkim.iteelearning.features.course;

import co.istad.sengkim.iteelearning.features.category.Category;
import co.istad.sengkim.iteelearning.features.enrollment.Enrollment;
import co.istad.sengkim.iteelearning.features.instructor.InstructorProfile;
import co.istad.sengkim.iteelearning.features.video.Video;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer countRating;
    private String description;
    private Float discountPercent;
    private Boolean isDeleted;
    private Boolean isPublished;
    private String keyword;
    private String level;
    private BigDecimal price;
    private String slug;
    private Float starRating;
    private String thumbnail;
    private String title;
    private Float totalHours;

    @ManyToOne
    private Category category;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private InstructorProfile instructorProfile;

    @OneToMany(mappedBy = "course")
    private List<Video> videos;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
