package com.example.demo.facade;

import com.example.demo.response.NameResponse;
import com.example.demo.facade.impl.NameFacadeImpl;
import com.example.demo.request.NameRequest;
import org.springframework.stereotype.Service;

@Service("nameFacade")
public class NameFacade implements NameFacadeImpl {
    @Override
    public NameResponse giveFullName(NameRequest nameRequest) {
        NameResponse nameResponse = new NameResponse();
        nameResponse.setFullName(nameRequest.getFirstName()+" "+nameRequest.getLastName());
        return nameResponse;
    }
}
