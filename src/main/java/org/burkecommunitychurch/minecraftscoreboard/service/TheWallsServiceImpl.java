package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.TheWallsDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.mapper.TheWallsMapper;
import org.burkecommunitychurch.minecraftscoreboard.repository.TheWallsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TheWallsServiceImpl implements TheWallsService {
    @Autowired
    private TheWallsRepository repo;

    @Autowired
    private TheWallsMapper mapper;

    @Override
    public List<TheWallsDTO> getAll() {
        return mapper.toDtoList(repo.findAll());
    }
}
