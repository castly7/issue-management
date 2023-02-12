package com.castly7.issuemanagement.service.impl;

import com.castly7.issuemanagement.entity.Project;
import com.castly7.issuemanagement.repository.ProjectRepository;
import com.castly7.issuemanagement.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
        project = projectRepository.save(project);
        return project;
    }
    @Override
    public Project getById(Long id) {
        return projectRepository.getOne(id);
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
    public Page<Project> getAllPageable(Pageable pageable) {
        return projectRepository.findAll(pageable);
    }
    @Override
    public Boolean delete(Project project){
        return null;
    }
}
