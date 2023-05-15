package com.home.project.service;

import com.home.project.model.Project;
import com.home.project.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project findById(Long id){
        return projectRepository.getOne(id);
    }

    public List<Project> findAll(){
        return projectRepository.findAll();
    }

    public Project saveProject(Project project){
        return projectRepository.save(project);
    }

    public void deleteById(Long id){
        projectRepository.deleteById(id);
    }
}
