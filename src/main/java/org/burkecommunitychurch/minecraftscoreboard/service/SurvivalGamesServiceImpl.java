package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.SurvivalGamesDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.mapper.SurvivalGamesMapper;
import org.burkecommunitychurch.minecraftscoreboard.repository.SurvivalGamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SurvivalGamesServiceImpl implements SurvivalGamesService {
    @Autowired
    private SurvivalGamesRepository repo;

    @Autowired
    private SurvivalGamesMapper mapper;

    @Override
    public List<SurvivalGamesDTO> getAll() {
        return mapper.toDtoList(repo.findAll());
    }

    @Override
    public List<SurvivalGamesDTO> getAllOrderByCoins() {
        return mapper.toDtoList(repo.findAllByOrderByCoinsDesc());
    }

    public List<SurvivalGamesDTO> getAllOrderByKills() {
        return mapper.toDtoList(repo.findAllByOrderByKillsDesc());
    }

    public List<SurvivalGamesDTO> getAllOrderByDeaths() {
        return mapper.toDtoList(repo.findAllByOrderByDeathsDesc());
    }

    public List<SurvivalGamesDTO> getAllOrderByWins() {
        return mapper.toDtoList(repo.findAllByOrderByWinsDesc());
    }

    public List<SurvivalGamesDTO> getAllOrderByGamesPlayed() {
        return mapper.toDtoList(repo.findAllByOrderByGamesPlayedDesc());
    }
}
