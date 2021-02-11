package org.burkecommunitychurch.minecraftscoreboard.repository;

import java.util.Collection;
import java.util.List;

import org.burkecommunitychurch.minecraftscoreboard.model.entity.PartiesSchemaHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartiesSchemaHistoryRepository extends CrudRepository<PartiesSchemaHistory, String> {
    //List<PartiesSchemaHistory> findAll();

    @Query(value = "SELECT * FROM parties_schema_history", nativeQuery = true)
    Collection<PartiesSchemaHistory> findAll();
}
