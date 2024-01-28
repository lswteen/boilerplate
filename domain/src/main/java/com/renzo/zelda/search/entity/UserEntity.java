package com.renzo.zelda.search.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity(name="user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {
    @Id
    //@Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String keyword;
    private String gender;

    public UserEntity(Long userId, String keyword, String gender) {
        this.userId = userId;
        this.keyword = keyword;
        this.gender = gender;
    }
//    @OneToMany(mappedBy = "userEntity")
//    private List<CareerEntity> careers;
//
//    @OneToOne(mappedBy = "userEntity")
//    private EducationEntity education;
//
//    @OneToOne(mappedBy = "userEntity")
//    private CompanyTypeEntity companyType;
//
//    @OneToOne(mappedBy = "userEntity")
//    private JobEntity job;
}
