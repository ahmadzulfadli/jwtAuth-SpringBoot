package com.users.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class BaseTable implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "created_on")
    private Date createdOn;
    @Column(name = "modified_on")
    private Date modifiedOn;
    @Column(name = "deleted_on")
    private Date deletedOn;
    @Column(name = "is_delete")
    private Boolean isDelete;
}
