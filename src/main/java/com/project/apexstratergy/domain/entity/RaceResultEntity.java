package com.project.apexstratergy.domain.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "race_results",
        uniqueConstraints = @UniqueConstraint(columnNames = {"race_id", "driver_id"}))
public class RaceResultEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private RaceEntity race;

    @ManyToOne
    private DriverEntity driver;

    private int gridPosition;

    private int finishPosition;

    private int points;

    private String status; // Finished, DNF
}
