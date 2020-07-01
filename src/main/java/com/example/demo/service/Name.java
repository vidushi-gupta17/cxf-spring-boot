package com.example.demo.service;

import com.example.demo.response.NameResponse;
import com.example.demo.request.NameRequest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface Name {

    @WebMethod
    @WebResult(name="Name")
    NameResponse giveName(@WebParam(name="Name") NameRequest nameRequest);

}