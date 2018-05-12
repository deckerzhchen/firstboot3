package com.microservice.firstboot.controller;

import com.microservice.firstboot.model.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api("User related api")
@RestController
@RequestMapping("/user")
public class FirstBootController {
    @ApiOperation("Get user information based on ID")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", dataType = "int", required = true, value = "User Id", defaultValue = "1")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "Parameter not filled"),
            @ApiResponse(code = 404, message = "Path incorrect")
    })
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public User getUserInfo(@RequestParam("id") int id) {
        if (id == 1) {
            return new User(1,"Decker", "12345");
        }
        return new User(2,"Alice", "67890");
    }
}
