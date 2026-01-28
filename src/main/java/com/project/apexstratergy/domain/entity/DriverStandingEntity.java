package com.project.apexstratergy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "driver_standings",
        uniqueConstraints = @UniqueConstraint(columnNames = {"season_year", "driver_id"}))
public class DriverStandingEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private SeasonEntity season;

    @ManyToOne
    private DriverEntity driver;

    private int points;

    private int wins;

    private int position;
}

