package com.mustafasoyler.springbootsoapexample.endpoint;

import com.mustafasoyler.spring_boot_soap_example.GetUserReguest;
import com.mustafasoyler.spring_boot_soap_example.GetUserResponse;
import com.mustafasoyler.springbootsoapexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndPoint {

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "http://mustafasoyler.com/spring-boot-soap-example" ,
            localPart = "getUserReguest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserReguest reguest){
        GetUserResponse response=new GetUserResponse();
        response.setUser(userService.getUsers(reguest.getName()));
        return  response;

    }
}
