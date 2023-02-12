package com.castly7.issuemanagement.repository;

import com.castly7.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {

    List<Project> getByProjectCode (String projectCode);
    List<Project> getByProjectCodeContains  (String projectCode);
    List<Project> findAll ();
    List<Project> findAllBy(Sort sort);

}
