package com.supporter.supporterWeb.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Entity
@Table(name = "Majors")
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
