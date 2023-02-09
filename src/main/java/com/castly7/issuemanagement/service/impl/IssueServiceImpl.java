package com.castly7.issuemanagement.service.impl;

import com.castly7.issuemanagement.entity.Issue;
import com.castly7.issuemanagement.repository.IssueRepository;
import com.castly7.issuemanagement.service.IssueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class IssueServiceImpl implements IssueService {
    private final IssueRepository issueRepository;
    public IssueServiceImpl(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    @Override
    public Issue save(Issue issue) {
        return issueRepository.save(issue);
    }

    @Override
    public Issue getById(Long id) {
        return issueRepository.getOne(id);
    }

    @Override
    public Page<Issue> getAllPageable(Pageable pageable) {
        return issueRepository.findAll(pageable);
    }
}
