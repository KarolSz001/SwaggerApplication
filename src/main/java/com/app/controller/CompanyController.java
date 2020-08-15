package com.app.controller;

import com.app.model.Company;
import com.app.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
@Api(value = "/companies", description = "Companies Rest API")
public class CompanyController {
    private final CompanyService companyService;

    @ApiOperation(value = "Returns all companies from collection")
    @ApiResponses(value = {
            @ApiResponse(code = 100, message = "100 is reurned"),
            @ApiResponse(code = 200, message = "200 is reurned")
    })
    @GetMapping
    public List<Company> getAll() {
        return companyService.getAll();
    }

    @PostMapping
    public Company add(@RequestBody Company company) {
        return companyService.add(company);
    }
}
