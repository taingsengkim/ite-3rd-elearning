package co.istad.sengkim.iteelearning.features.comment;

import co.istad.sengkim.iteelearning.features.video.Video;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    private Integer id;
    private LocalDateTime createdAt;
    private Boolean isDeleted;
    private String text;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Comment comment;

    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;
}
