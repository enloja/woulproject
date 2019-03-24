package io.agileintelligence.ppmtool.repositories;

import io.agileintelligence.ppmtool.domain.Project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

     Project findAllByProjectIdentifier(String projectID);

     @Override
     Iterable<Project> findAll();

     Iterable<Project> findAllByProjectLeader(String username);



}
