package com.project.apexstratergy.domain.entity;
import com.project.apexstratergy.domain.enums.TyreCompound;
import jakarta.persistence.*;

@Entity
@Table(name = "tyre_stints")
public class TyreStintEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private RaceEntity race;

    @ManyToOne
    private DriverEntity driver;

    @Enumerated(EnumType.STRING)
    private TyreCompound compound; // SOFT, MEDIUM, HARD

    private int startLap;

    private int endLap;
}

