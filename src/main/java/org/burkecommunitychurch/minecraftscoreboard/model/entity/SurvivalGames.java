package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sgnew_")
@NoArgsConstructor
public class SurvivalGames {
    @Id
    @Column(name = "player_uuid")
    @Getter
    private String playerUuid;

    @Column(name = "player_name")
    @Getter
    private String playerName;

    @Column(name = "Coins")
    @Getter
    private int coins;

    @Column(name = "Kills")
    @Getter
    private int kills;

    @Column(name = "Deaths")
    @Getter
    private int deaths;

    @Column(name = "Wins")
    @Getter
    private int wins;

    @Column(name = "Gamesplayed")
    @Getter
    private int gamesPlayed;

    @Column(name = "Modifier")
    @Getter
    private int modifier;

    @Column(name = "Play_Time")
    @Getter
    private String playTime;

    @Column(name = "Kits")
    @Getter
    private String kits;

    @Column(name = "Exp")
    @Getter
    private int exp;
}
