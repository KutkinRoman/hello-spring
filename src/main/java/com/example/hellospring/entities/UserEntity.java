package com.example.hellospring.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

@Getter
@Setter
public class UserEntity extends PersonEntity {

    private String username;

    private String password;

    private HashSet<RoleEntity> roles;

}
