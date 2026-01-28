package com.project.apexstratergy.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teams")
public class TeamEntity {

    @Id
    private String id;

    private String name;

    private String nationality;
}
