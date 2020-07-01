package com.example.demo.facade.impl;

import com.example.demo.response.NameResponse;
import com.example.demo.request.NameRequest;

public interface NameFacadeImpl {
    NameResponse giveFullName(NameRequest nameRequest);
}
