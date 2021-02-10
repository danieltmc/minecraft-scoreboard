package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.OneInTheBattleDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.mapper.OneInTheBattleMapper;
import org.burkecommunitychurch.minecraftscoreboard.repository.OneInTheBattleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OneInTheBattleServiceImpl implements OneInTheBattleService {
    @Autowired
    private OneInTheBattleRepository repo;

    @Autowired
    private OneInTheBattleMapper mapper;

    @Override
    public List<OneInTheBattleDTO> getAll() {
        return mapper.toDtoList(repo.findAll());
    }
}
