package com.supporter.supporterWeb.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Posts")
public class post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;
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
