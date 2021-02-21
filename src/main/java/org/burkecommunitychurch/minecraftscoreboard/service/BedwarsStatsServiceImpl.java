package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.burkecommunitychurch.minecraftscoreboard.model.constant.BedwarsStatsKeyEnum;
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

    // @Override
    // public List<BedwarsStatsDTO> getAllByKey(String key) {
    //     return mapper.toDtoList(repo.findByKeyOrderByValueDesc(key));
    // }
    @Override
    public List<BedwarsStatsDTO> getAllByKey(BedwarsStatsKeyEnum key) {
        return mapper.toDtoList(repo.findByKeyOrderByValueDesc(key.toString()));
    }
}
