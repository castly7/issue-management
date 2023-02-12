package com.castly7.issuemanagement.dto;

import com.castly7.issuemanagement.entity.IssueStatus;
import com.castly7.issuemanagement.entity.Project;
import com.castly7.issuemanagement.entity.User;
import lombok.Data;

import java.util.Date;

@Data
public class IssueDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;
}
