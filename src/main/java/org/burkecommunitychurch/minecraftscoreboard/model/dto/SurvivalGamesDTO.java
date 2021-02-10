package org.burkecommunitychurch.minecraftscoreboard.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SurvivalGamesDTO {
    private String playerUuid;
    private String playerName;
    private int coins;
    private int kills;
    private int deaths;
    private int wins;
    private int gamesPlayed;
    private int modifier;
    private String playTime;
    private String kits;
    private int exp;
}
