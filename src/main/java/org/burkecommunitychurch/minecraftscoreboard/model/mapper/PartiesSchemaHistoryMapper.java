package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.PartiesSchemaHistoryDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.PartiesSchemaHistory;

public abstract class PartiesSchemaHistoryMapper {
    public PartiesSchemaHistoryDTO toDto(PartiesSchemaHistory partiesSchemaHistory) {
        PartiesSchemaHistoryDTO dto = new PartiesSchemaHistoryDTO();
        dto.setId(partiesSchemaHistory.getId());
        dto.setVersion(partiesSchemaHistory.getVersion());
        dto.setDescription(partiesSchemaHistory.getDescription());
        dto.setScriptName(partiesSchemaHistory.getScriptName());
        dto.setInstallDate(partiesSchemaHistory.getInstallDate());
        return dto;
    }
}
