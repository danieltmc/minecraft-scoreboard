package org.burkecommunitychurch.minecraftscoreboard.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PartiesPartiesDTO {
    private String id;
    private String name;
    private String tag;
    private String leader;
    private String description;
    private String motd;
    private String color;
    private int kills;
    private String password;
    private String home;
    private int protection;
    private double experience;
    private int follow;
}
