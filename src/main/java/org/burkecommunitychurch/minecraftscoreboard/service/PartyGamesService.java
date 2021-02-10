package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.PartyGamesDTO;

public interface PartyGamesService {
    List<PartyGamesDTO> getAll();
}
