package com.app.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(
        value = "Company",
        description = "This is model of cpmpany"
)
public class Company {
    @ApiModelProperty(notes = "name of company")
    private String name;
    @ApiModelProperty(notes = "city of company")
    private String city;
}
