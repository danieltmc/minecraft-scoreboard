package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.PartiesSchemaHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartiesSchemaHistoryRepository extends CrudRepository<PartiesSchemaHistory, String> {
    List<PartiesSchemaHistory> findAll();
}
