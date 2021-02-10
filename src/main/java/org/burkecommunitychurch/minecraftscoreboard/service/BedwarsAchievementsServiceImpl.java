package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsAchievementsDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.mapper.BedwarsAchievementsMapper;
import org.burkecommunitychurch.minecraftscoreboard.repository.BedwarsAchievementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BedwarsAchievementsServiceImpl implements BedwarsAchievementsService {
    @Autowired
    private BedwarsAchievementsRepository repo;

    @Autowired
    private BedwarsAchievementsMapper mapper;

    @Override
    public List<BedwarsAchievementsDTO> getAll() {
        return mapper.toDtoList(repo.findAll());
    }
}
