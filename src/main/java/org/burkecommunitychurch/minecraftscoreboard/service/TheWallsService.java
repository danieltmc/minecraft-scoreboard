package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.TheWallsDTO;

public interface TheWallsService {
    List<TheWallsDTO> getAll();
}
