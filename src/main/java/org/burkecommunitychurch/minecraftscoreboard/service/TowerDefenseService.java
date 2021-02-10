package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.TowerDefenseDTO;

public interface TowerDefenseService {
    List<TowerDefenseDTO> getAll();
}
