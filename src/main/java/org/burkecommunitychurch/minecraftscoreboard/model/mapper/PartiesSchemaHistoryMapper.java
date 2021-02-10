package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<PartiesSchemaHistoryDTO> toDtoList(List<PartiesSchemaHistory> list) {
        return list.stream().map(psh ->
            toDto(psh))
            .collect(Collectors.toList());
    }
}
