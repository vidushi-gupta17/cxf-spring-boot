package com.example.demo.service;

import com.example.demo.response.NameResponse;
import com.example.demo.facade.NameFacade;
import com.example.demo.request.NameRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v2")
@Component
public class NameController {
    @Autowired
    private NameFacade nameFacade;


    @POST
    @Produces({"application/json", "application/xml"})
    @Consumes({ MediaType.APPLICATION_JSON, "application/xml"})
    @Path(value="/listFullName")
    public NameResponse giveFullName(NameRequest nameRequest) {

        return nameFacade.giveFullName(nameRequest);
    }
}
