package org.burkecommunitychurch.minecraftscoreboard.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.burkecommunitychurch.minecraftscoreboard.model.constant.BedwarsStatsKeyEnum;

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
public class BedwarsStatsDTO {
    @JsonProperty("playerUuid")
    private String playerUuid;
    
    @JsonProperty("userName")
    private String userName;

    @JsonProperty("key")
    //private String key;
    private BedwarsStatsKeyEnum key;
    
    @JsonProperty("value")
    private float value;
}
