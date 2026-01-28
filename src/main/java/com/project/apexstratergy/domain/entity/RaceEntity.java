package com.project.apexstratergy.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "races")
public class RaceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String raceName; // Bahrain GP

    private int round;

    private LocalDate raceDate;

    private String circuitName;

    @ManyToOne
    private SeasonEntity season;
}
