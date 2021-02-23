package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MojangPlayer {
    @Id
    private String id;
    private String name;
    private MojangPlayerProperty[] properties;
}
