package com.example.hellospring.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Setter
public class BaseEntity {

    private UUID id;

    private LocalDateTime createTs;

    private LocalDateTime updatedTs;

}
