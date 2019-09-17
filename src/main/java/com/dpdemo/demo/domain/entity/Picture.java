package com.dpdemo.demo.domain.entity;

import lombok.Data;

@Data
public class Picture {

    private Integer pictureId;

    private String picturePath;

    private Integer filmId;

    private Integer pictureStatus;

}
