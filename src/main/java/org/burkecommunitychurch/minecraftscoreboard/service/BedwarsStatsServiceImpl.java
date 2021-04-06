package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.Comparator;
import java.util.List;

import javax.transaction.Transactional;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsStatsDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.entity.BedwarsStats;
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
        List<BedwarsStats> results;
        switch (key) {
            case "beds_destroyed":
                results = repo.findByBedsDestroyedOrderByValueDesc();
            case "cache_rank":
                results = repo.findByCacheRankOrderByValueDesc();
            case "deaths":
                results = repo.findByDeathsOrderByValueDesc();
            case "final_kills":
                results = repo.findByFinalKillsOrderByValueDesc();
            case "kd":
                results = repo.findByKDOrderByValueDesc();
            case "kills":
                results = repo.findByKillsOrderByValueDesc();
            case "loses":
                results = repo.findByLossesOrderByValueDesc();
            case "play_time":
                results = repo.findByPlayTimeOrderByValueDesc();
            case "rank":
                results = repo.findByRankOrderByValueDesc();
            case "rounds_played":
                results = repo.findByRoundsPlayedOrderByValueDesc();
            case "wins":
                results = repo.findByWinsOrderByValueDesc();
            case "wl":
                results = repo.findByWLOrderByValueDesc();
            default:
                results = repo.findAll();
        }
        List<BedwarsStatsDTO> dtos = mapper.toDtoList(results);
        dtos.sort(Comparator.comparing(BedwarsStatsDTO::getValue).reversed());
        return dtos;
    }
}
