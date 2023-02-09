package com.castly7.issuemanagement.service.impl;

import com.castly7.issuemanagement.entity.Project;
import com.castly7.issuemanagement.repository.ProjectRepository;
import com.castly7.issuemanagement.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    public ProjectServiceImpl(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }
    @Override
    public Project save(Project project) {
        if (project.getProjectCode() == null){
            throw new IllegalArgumentException("Project Code Cannot be null!");
        }
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Project getById(Long id) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return null;
    }
}
