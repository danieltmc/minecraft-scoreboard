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
public class OneInTheBattleDTO {
    @JsonProperty("playerUuid")
    private String playerUuid;
    @JsonProperty("playerName")
    private String playerName;
    @JsonProperty("stats")
    private String stats;
    @JsonProperty("loadout")
    private String loadout;
    @JsonProperty("inventory")
    private String inventory;
}
