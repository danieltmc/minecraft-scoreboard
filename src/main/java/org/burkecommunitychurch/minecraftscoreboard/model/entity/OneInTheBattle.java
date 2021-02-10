package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "OneInTheBattle")
@NoArgsConstructor
public class OneInTheBattle {
    @Id
    @Column(name = "player_uuid")
    @Getter
    private String playerUuid;

    @Column(name = "player_name")
    @Getter
    private String playerName;

    @Column(name = "stats")
    @Getter
    private String stats;

    @Column(name = "loadout")
    @Getter
    private String loadout;

    @Column(name = "inventory")
    @Getter
    private String inventory;
}
