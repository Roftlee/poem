package com.lys.model;

import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class User {
    private Long id;

    private Long appId;

    private String phone;

    private String realName;

    private String nickname;

    private String avatar;

    private Integer sex;

    private String idCard;

    private Integer roleType;

    private String position;

    private Date lastInspectTime;

    private Integer privilegeType;

    private Integer status;

    private Date createdTime;

    private Date updatedTime;
}