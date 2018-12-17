package com.gt.feign.client;

import java.util.List;

import com.gt.feign.client.Resource.BulloneResource;
import com.gt.feign.dto.Bullone;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

public class BulloneFeignController {

	private GenericClient genericClient;
	
	public BulloneFeignController(){
		genericClient = Feign.builder()
				  .client(new OkHttpClient())
				  .encoder(new GsonEncoder())
				  .decoder(new GsonDecoder())
				  .logger(new Slf4jLogger(GenericClient.class))
				  .logLevel(Logger.Level.FULL)
				  .target(GenericClient.class, "http://localhost:8080/bullone");
		
		
	}
	
	public Bullone findById(Long id){
		BulloneResource bulloneResource = genericClient.findById(id);
		return bulloneResource.getBullone();
	}
	
	public void create(Bullone bullone){
		genericClient.create(bullone);
	}
	
	public List<BulloneResource>  findAll(){
	    List<BulloneResource> lista = genericClient.findAll();
		return lista;
	}
}
