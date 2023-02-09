package com.castly7.issuemanagement.service;

import com.castly7.issuemanagement.entity.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {
    Issue save(Issue issue);
    Issue getById(Long id);
    Page<Issue> getAllPageable(Pageable pageable);
}
