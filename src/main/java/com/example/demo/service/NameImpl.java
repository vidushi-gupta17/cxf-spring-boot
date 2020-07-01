package com.example.demo.service;

import com.example.demo.response.NameResponse;
import com.example.demo.facade.NameFacade;
import com.example.demo.request.NameRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService
@Component
public class NameImpl implements Name{

    @Autowired
    private NameFacade nameFacade;

    @Override
    public NameResponse giveName(NameRequest nameRequest) {
        return nameFacade.giveFullName(nameRequest);
    }
}
