package com.test.rest;

import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Api(
        value = "Hello Service",
        description = "This API will greet you",
        produces = MediaType.APPLICATION_JSON,
        basePath = "/api"
)
public class HelloEndpoint {

    @GET
    public String hello() {
        return "hello";
    }

}
