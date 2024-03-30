package com.supporter.supporterWeb.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@Entity
@Table(name = "Majors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class major {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    public String name;

    @NonNull
    @OneToMany
    @JoinColumn(name = "courses_id")
    public ArrayList<course> courses;

    @Override
    public String toString() {
        return "major{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
