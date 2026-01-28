package com.project.apexstratergy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "team_standings",
        uniqueConstraints = @UniqueConstraint(columnNames = {"season_year", "team_id"}))
public class TeamStandingEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private SeasonEntity season;

    @ManyToOne
    private TeamEntity team;

    private int points;

    private int position;
}
