package co.istad.sengkim.iteelearning.features.category;

import co.istad.sengkim.iteelearning.features.course.Course;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String name;
    private String icon;

    @Column(nullable = false)
    private Boolean isDeleted;

    @OneToMany(mappedBy = "category")
    private List<Course> courses;
}
