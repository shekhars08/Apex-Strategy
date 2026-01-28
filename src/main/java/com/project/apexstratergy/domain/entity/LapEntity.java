package com.project.apexstratergy.domain.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "laps",
        indexes = @Index(name = "idx_race_driver_lap", columnList = "race_id, driver_id, lapNumber"))
public class LapEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private RaceEntity race;

    @ManyToOne
    private DriverEntity driver;

    private int lapNumber;

    private Long lapTimeMillis;

    private int position;
}
