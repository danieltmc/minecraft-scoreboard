package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsStatsDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.mapper.BedwarsStatsMapper;
import org.burkecommunitychurch.minecraftscoreboard.repository.BedwarsStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BedwarsStatsServiceImpl implements BedwarsStatsService {
    @Autowired
    private BedwarsStatsRepository repo;

    @Autowired
    private BedwarsStatsMapper mapper;

    @Override
    public List<BedwarsStatsDTO> getAll() {
        return mapper.toDtoList(repo.findAll());
    }

    @Override
    public List<BedwarsStatsDTO> getAllByKey(String key) {
        switch (key) {
            case "beds_destroyed":
                return mapper.toDtoList(repo.findByBedsDestroyedOrderByValueDesc());
            case "cache_rank":
                return mapper.toDtoList(repo.findByCacheRankOrderByValueDesc());
            case "deaths":
                return mapper.toDtoList(repo.findByDeathsOrderByValueDesc());
            case "final_kills":
                return mapper.toDtoList(repo.findByFinalKillsOrderByValueDesc());
            case "kd":
                return mapper.toDtoList(repo.findByKDOrderByValueDesc());
            case "kills":
                return mapper.toDtoList(repo.findByKillsOrderByValueDesc());
            case "loses":
                return mapper.toDtoList(repo.findByLossesOrderByValueDesc());
            case "play_time":
                return mapper.toDtoList(repo.findByPlayTimeOrderByValueDesc());
            case "rank":
                return mapper.toDtoList(repo.findByRankOrderByValueDesc());
            case "rounds_played":
                return mapper.toDtoList(repo.findByRoundsPlayedOrderByValueDesc());
            case "wins":
                return mapper.toDtoList(repo.findByWinsOrderByValueDesc());
            case "wl":
                return mapper.toDtoList(repo.findByWLOrderByValueDesc());
        }
        return mapper.toDtoList(repo.findAll());
    }
}
