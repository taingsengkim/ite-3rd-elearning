package co.istad.sengkim.iteelearning.features.video;

import co.istad.sengkim.iteelearning.features.comment.Comment;
import co.istad.sengkim.iteelearning.features.course.Course;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.plaf.ColorUIResource;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "videos")
public class Video {
    @Id
    private Integer id;
    private String duration;
    private Boolean isDeleted;
    private Boolean isPublished;
    private String slug;
    private String thumbnail;
    private String title;
    private String youtube;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "video")
    private List<Comment> comment ;
}
