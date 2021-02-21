package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.constant.BedwarsStatsKeyEnum;
import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsStatsDTO;

public interface BedwarsStatsService {
    List<BedwarsStatsDTO> getAll();

    //List<BedwarsStatsDTO> getAllByKey(String key);
    List<BedwarsStatsDTO> getAllByKey(BedwarsStatsKeyEnum key);
}
