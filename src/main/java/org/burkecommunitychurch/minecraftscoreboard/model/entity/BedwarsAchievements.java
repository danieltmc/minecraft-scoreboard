package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mbedwars_player_achievements")
@NoArgsConstructor
public class BedwarsAchievements {
    @Id
    @Column(name = "player_uuid")
    @Getter
    private String playerUuid;

    @Column(name = "id")
    @Getter
    private String id;
    // "bedwars:lose_round", "bedwars:use_fireball", "bedwars:win_round", "bedwars:win_within_time"

    @Column(name = "earn_date")
    @Getter
    private String earnDate;
}
