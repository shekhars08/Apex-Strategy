package com.project.apexstratergy.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "seasons")
public class SeasonEntity {

    @Id
    private Integer year;
    private String regulationVersion;


}
