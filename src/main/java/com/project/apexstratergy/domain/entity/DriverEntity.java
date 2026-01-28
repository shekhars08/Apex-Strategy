package com.project.apexstratergy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "drivers")
public class DriverEntity {

    @Id
    private String id;

    private String name;

    private String code;

    private int permanentNumber;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity team;


}
