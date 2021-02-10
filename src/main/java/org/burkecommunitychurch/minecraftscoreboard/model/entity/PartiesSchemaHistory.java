package org.burkecommunitychurch.minecraftscoreboard.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "parties_schema_history")
@NoArgsConstructor
public class PartiesSchemaHistory {
    @Id
    @Column(name = "id")
    @Getter
    private int id;

    @Column(name = "version")
    @Getter
    private int version;

    @Column(name = "description")
    @Getter
    private String description;

    @Column(name = "script_name")
    @Getter
    private String scriptName;

    @Column(name = "install_date")
    @Getter
    private int installDate;
}
