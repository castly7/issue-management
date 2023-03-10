package com.castly7.issuemanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "uname",length = 100,unique = true)
    private String userName;

    @Column(name = "pwd",length = 200)
    private String password;

    @Column(name = "name_surname", length = 200)
    private String nameSurname;

    @Column(name = "email",length = 100)
    private String email;

    @JoinColumn(name = "assignee_user_id")
    @OneToMany()
    private List<Issue> issues;
}