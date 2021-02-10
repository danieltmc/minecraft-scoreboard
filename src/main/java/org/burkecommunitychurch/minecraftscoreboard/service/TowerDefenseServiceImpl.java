package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.TowerDefenseDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.mapper.TowerDefenseMapper;
import org.burkecommunitychurch.minecraftscoreboard.repository.TowerDefenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TowerDefenseServiceImpl implements TowerDefenseService {
    @Autowired
    private TowerDefenseRepository repo;

    @Autowired
    private TowerDefenseMapper mapper;

    @Override
    public List<TowerDefenseDTO> getAll() {
        return mapper.toDtoList(repo.findAll());
    }
}
