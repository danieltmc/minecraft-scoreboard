package org.burkecommunitychurch.minecraftscoreboard.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PartiesPartiesDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("leader")
    private String leader;
    @JsonProperty("description")
    private String description;
    @JsonProperty("motd")
    private String motd;
    @JsonProperty("color")
    private String color;
    @JsonProperty("kills")
    private int kills;
    @JsonProperty("password")
    private String password;
    @JsonProperty("home")
    private String home;
    @JsonProperty("protection")
    private int protection;
    @JsonProperty("experience")
    private double experience;
    @JsonProperty("follow")
    private int follow;
}
