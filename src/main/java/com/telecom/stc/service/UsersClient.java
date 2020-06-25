package com.telecom.stc.service;

import com.telecom.stc.model.GetUserRequest;
import com.telecom.stc.model.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class UsersClient {


    @Autowired
    Jaxb2Marshaller marshaller;

    WebServiceTemplate template;

    public GetUserResponse getUsers(GetUserRequest request){

        template=new WebServiceTemplate(marshaller);
       GetUserResponse response= (GetUserResponse)template.marshalSendAndReceive("http://localhost:8091/soapWS",request);
       return response;


    }
}
