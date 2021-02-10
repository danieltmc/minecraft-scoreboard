package org.burkecommunitychurch.minecraftscoreboard.model.mapper;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.PartiesPartiesDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.PartiesParties;

public abstract class PartiesPartiesMapper {
    public PartiesPartiesDTO toDto(PartiesParties partiesParties) {
        PartiesPartiesDTO dto = new PartiesPartiesDTO();
        dto.setId(partiesParties.getId());
        dto.setName(partiesParties.getName());
        dto.setTag(partiesParties.getTag());
        dto.setLeader(partiesParties.getLeader());
        dto.setDescription(partiesParties.getDescription());
        dto.setMotd(partiesParties.getMotd());
        dto.setColor(partiesParties.getColor());
        dto.setKills(partiesParties.getKills());
        dto.setPassword(partiesParties.getPassword());
        dto.setHome(partiesParties.getHome());
        dto.setProtection(partiesParties.getProtection());
        dto.setExperience(partiesParties.getExperience());
        dto.setFollow(partiesParties.getFollow());
        return dto;
    }
}
