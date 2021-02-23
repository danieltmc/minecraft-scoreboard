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
public class PartyGamesDTO {
    @JsonProperty("playerUuid")
    private String playerUuid;
    
    @JsonProperty("playerName")
    private String playerName;
    
    @JsonProperty("data")
    private String data;
}
