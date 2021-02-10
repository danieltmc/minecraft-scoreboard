package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mbedwars_player_properties")
@NoArgsConstructor
public class BedwarsProperties {
    @Id
    @Column(name = "player_uuid")
    @Getter
    private String playerUuid;

    @Column(name = "id")
    @Getter
    private String id;

    @Column(name = "value")
    @Getter
    private String value;
}
