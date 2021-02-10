package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.PartiesPartiesDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.mapper.PartiesPartiesMapper;
import org.burkecommunitychurch.minecraftscoreboard.repository.PartiesPartiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PartiesPartiesServiceImpl implements PartiesPartiesService {
    @Autowired
    private PartiesPartiesRepository repo;

    @Autowired
    private PartiesPartiesMapper mapper;

    @Override
    public List<PartiesPartiesDTO> getAll() {
        return mapper.toDtoList(repo.findAll());
    }

    @Override
    public List<PartiesPartiesDTO> getAllOrderByKills() {
        return mapper.toDtoList(repo.findAllOrderByKillsDesc());
    }

    @Override
    public List<PartiesPartiesDTO> getAllOrderByExperience() {
        return mapper.toDtoList(repo.findAllOrderByExperienceDesc());
    }
}
