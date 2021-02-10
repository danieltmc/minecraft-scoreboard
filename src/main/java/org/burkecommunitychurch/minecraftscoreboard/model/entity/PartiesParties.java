package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "parties_parties")
@NoArgsConstructor
public class PartiesParties {
    @Id
    @Column(name = "id")
    @Getter
    private String id;

    @Column(name = "name")
    @Getter
    private String name;

    @Column(name = "tag")
    @Getter
    private String tag;

    @Column(name = "leader")
    @Getter
    private String leader;

    @Column(name = "description")
    @Getter
    private String description;

    @Column(name = "motd")
    @Getter
    private String motd;

    @Column(name = "color")
    @Getter
    private String color;

    @Column(name = "kills")
    @Getter
    private int kills;

    @Column(name = "password")
    @Getter
    private String password;

    @Column(name = "home")
    @Getter
    private String home;

    @Column(name = "protection")
    @Getter
    private int protection;

    @Column(name = "experience")
    @Getter
    private double experience;

    @Column(name = "follow")
    @Getter
    private int follow;
}
