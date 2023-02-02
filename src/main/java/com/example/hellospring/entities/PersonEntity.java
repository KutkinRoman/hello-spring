package com.example.hellospring.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonEntity extends BaseEntity {

    private String firstName;

    private String lastName;

}
