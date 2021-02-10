package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.BedwarsPropertiesDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.mapper.BedwarsPropertiesMapper;
import org.burkecommunitychurch.minecraftscoreboard.repository.BedwarsPropertiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BedwarsPropertiesServiceImpl implements BedwarsPropertiesService {
    @Autowired
    private BedwarsPropertiesRepository repo;

    @Autowired
    private BedwarsPropertiesMapper mapper;

    @Override
    public List<BedwarsPropertiesDTO> getAll() {
        return mapper.toDtoList(repo.findAll());
    }
}
