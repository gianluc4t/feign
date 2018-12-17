package com.gt.feign.client;

import java.util.List;

import com.gt.feign.client.Resource.BulloneResource;
import com.gt.feign.dto.Bullone;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface GenericClient {

    @RequestLine("GET /{id}")
    BulloneResource findById(@Param("id") Long id);
 
    @RequestLine("GET")
    List<BulloneResource> findAll();
 
    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    void create(Bullone bullone);
	
}
