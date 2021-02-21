package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.burkecommunitychurch.minecraftscoreboard.model.constant.BedwarsStatsKeyEnum;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mbedwars_player_stats")
@NoArgsConstructor
public class BedwarsStats {
    @Id
    @Column(name = "player_uuid")
    @Getter
    private String playerUuid;

    @Column(name = "key")
    @Getter
    //private String key;
    private BedwarsStatsKeyEnum key;

    @Column(name = "value")
    @Getter
    private Float value;
}
