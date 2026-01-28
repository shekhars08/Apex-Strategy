package com.project.apexstratergy.domain.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "pit_stops")
public class PitStopEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private RaceEntity race;

    @ManyToOne
    private DriverEntity driver;

    private int lap;

    private double durationSeconds;
}
