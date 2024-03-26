package com.supporter.supporterWeb.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Users")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private String password;

    @OneToOne
    @JoinColumn(name = "major_id")
    private major major;

    private LocalDateTime CreatedAt;
    private LocalDateTime ModifiedAt;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", major=" + major +
                ", CreatedAt=" + CreatedAt +
                ", ModifiedAt=" + ModifiedAt +
                '}';
    }
}
