package com.example.priyanshu.databasedesign1.Models;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@MappedSuperclass
public class BaseModel {
    @Id
    long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    private boolean deletedAt;
}
