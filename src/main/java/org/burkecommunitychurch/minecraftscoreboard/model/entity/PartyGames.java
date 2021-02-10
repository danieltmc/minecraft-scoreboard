package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PartyGames_new")
@NoArgsConstructor
public class PartyGames {
    @Id
    @Column(name = "player_uuid")
    @Getter
    private String playerUuid;

    @Column(name = "player_name")
    @Getter
    private String playerName;

    @Column(name = "data")
    @Getter
    private String data;
}
