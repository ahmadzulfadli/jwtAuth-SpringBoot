package com.users.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Biodata extends BaseTable{
    private String address;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "pleace_of_birth")
    private String pleaceOfBirth;
    private String age;
}
