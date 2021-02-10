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
public class PartiesSchemaHistoryDTO {
    @JsonProperty("id")
    private int id;
    @JsonProperty("version")
    private int version;
    @JsonProperty("description")
    private String description;
    @JsonProperty("scriptName")
    private String scriptName;
    @JsonProperty("installDate")
    private int installDate;
}
