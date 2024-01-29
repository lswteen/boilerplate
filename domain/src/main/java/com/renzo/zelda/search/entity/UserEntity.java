package com.renzo.zelda.search.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity(name="user")
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String keyword;

    private String gender;

    public UserEntity(Long userId, String keyword, String gender) {
        this.userId = userId;
        this.keyword = keyword;
        this.gender = gender;
    }
}
