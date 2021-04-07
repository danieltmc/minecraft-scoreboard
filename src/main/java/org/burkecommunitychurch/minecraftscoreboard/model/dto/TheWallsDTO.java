package org.burkecommunitychurch.minecraftscoreboard.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TheWallsDTO {
    @JsonProperty("playerUuid")
    private String playerUuid;

    @JsonProperty("player_name")
    private String playerName;

    @JsonProperty("stats")
    private String stats;

    @JsonProperty("inventory")
    private String inventory;

    @JsonProperty("selected")
    private String selected;
}
