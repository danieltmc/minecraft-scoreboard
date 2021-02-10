package org.burkecommunitychurch.minecraftscoreboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.burkecommunitychurch.minecraftscoreboard.model.dto.PartyGamesDTO;
import org.burkecommunitychurch.minecraftscoreboard.model.mapper.PartyGamesMapper;
import org.burkecommunitychurch.minecraftscoreboard.repository.PartyGamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PartyGamesServiceImpl implements PartyGamesService {
    @Autowired
    private PartyGamesRepository repo;

    @Autowired
    private PartyGamesMapper mapper;

    @Override
    public List<PartyGamesDTO> getAll() {
        return mapper.toDtoList(repo.findAll());
    }
}
