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
public class SurvivalGamesDTO {
    @JsonProperty("playerUuid")
    private String playerUuid;
    @JsonProperty("playerName")
    private String playerName;
    @JsonProperty("coins")
    private int coins;
    @JsonProperty("kills")
    private int kills;
    @JsonProperty("deaths")
    private int deaths;
    @JsonProperty("wins")
    private int wins;
    @JsonProperty("gamesPlayed")
    private int gamesPlayed;
    @JsonProperty("modifier")
    private int modifier;
    @JsonProperty("playTime")
    private String playTime;
    @JsonProperty("kits")
    private String kits;
    @JsonProperty("exp")
    private int exp;
}
