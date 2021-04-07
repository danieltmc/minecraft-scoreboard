package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TheWalls")
@Getter
@NoArgsConstructor
public class TheWalls {
    @Id
    @Column(name = "player_uuid")
    private String playerUuid;

    @Column(name = "player_name")
    private String playerName;

    @Column(name = "stats")
    private String stats;

    @Column(name = "inventory")
    private String inventory;

    @Column(name = "selected")
    private String selected;
}
