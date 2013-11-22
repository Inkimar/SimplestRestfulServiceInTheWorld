/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.mediaserver.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * to run -> http://localhost:8080/mavenproject1/resources/test
 * @author ingimar
 */
@Path(value = "test")
public class Resource {

    @GET
    public String get() {
        return "Hello World";
    }
}
