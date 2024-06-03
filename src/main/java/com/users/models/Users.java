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
public class Users extends BaseTable{

    private String username;
    private String email;
    @Column(name = "no_hp")
    private String noHp;
    private String password;
}
