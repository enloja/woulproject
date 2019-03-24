package io.agileintelligence.ppmtool.repositories;

import io.agileintelligence.ppmtool.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectTaskRepository extends CrudRepository <ProjectTask, Long> {

    Iterable<ProjectTask> findByProjectIdentifier(String id);

    ProjectTask findByProjectSequence(String sequence);
}
