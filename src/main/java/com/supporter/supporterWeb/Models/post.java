package com.supporter.supporterWeb.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
@Setter
@Entity
@Table(name = "Posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private String pdfDbName;
    @NonNull
    private String link;

    @OneToOne
    @JoinColumn(name = "course_id")
    private course course;

    @OneToOne
    @JoinColumn(name = "major_id")
    private major major;

    @OneToMany
    @JoinColumn(name = "post_id")
    private ArrayList<comments> comments;
    private LocalDateTime CreatedAt;
    private LocalDateTime ModifiedAt;

    @Override
    public String toString() {
        return "post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pdfDbName='" + pdfDbName + '\'' +
                ", link='" + link + '\'' +
                ", course=" + course +
                ", major=" + major +
                ", CreatedAt=" + CreatedAt +
                ", ModifiedAt=" + ModifiedAt +
                '}';
    }
}
