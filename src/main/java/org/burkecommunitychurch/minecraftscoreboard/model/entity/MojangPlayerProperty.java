package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MojangPlayerProperty {
    private String name;
    private String value;
}
