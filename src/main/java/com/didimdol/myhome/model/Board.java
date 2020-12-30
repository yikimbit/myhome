package com.didimdol.myhome.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min=2, max=50, message="2자 이상 50자 이하 입니다")
    private String title;

    // validator 사용
    private String content;

    @JsonIgnore
    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;
}
