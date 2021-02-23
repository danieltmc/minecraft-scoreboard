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
public class BedwarsAchievementsDTO {
    @JsonProperty("playerUuid")
    private String playerUuid;

    @JsonProperty("userName")
    private String userName;
    
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("earnDate")
    private String earnDate;
}
