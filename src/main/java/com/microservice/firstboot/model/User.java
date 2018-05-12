package com.microservice.firstboot.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@ApiModel("User model")
@AllArgsConstructor
@Getter
public class User {
    @ApiModelProperty("User ID")
    private int id;
    @ApiModelProperty("User name")
    private String name;
    @ApiModelProperty("User password")
    private String password;
}
