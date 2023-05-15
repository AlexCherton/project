package com.home.project.service;

import com.home.project.model.Performer;
import com.home.project.model.Project;
import com.home.project.repository.PerformerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerformerService {

    private final PerformerRepository performerRepository;

    @Autowired
    public PerformerService(PerformerRepository performerRepository) {
        this.performerRepository = performerRepository;
    }

    public Performer findById(Long id) {
        return performerRepository.getOne(id);
    }

    public List<Performer> findAll() {
        return performerRepository.findAll();
    }

    public Performer savePerformer(Performer performer) {
        return performerRepository.save(performer);
    }

    public void deleteById(Long id) {
        performerRepository.deleteById(id);
    }
}
