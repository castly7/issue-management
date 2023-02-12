package com.castly7.issuemanagement.service;

import com.castly7.issuemanagement.dto.IssueDto;
import com.castly7.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {
    IssueDto save(IssueDto issue);
    IssueDto getById(Long id);
    TPage<IssueDto> getAllPageable(Pageable pageable);
    Boolean delete (IssueDto issue);
}
