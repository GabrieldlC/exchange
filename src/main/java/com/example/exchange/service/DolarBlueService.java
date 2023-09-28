package com.example.exchange.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.exchange.dto.Cotizacion;

@Service
public class DolarBlueService {

	private final RestTemplate restTemplate;
	
	public DolarBlueService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public Cotizacion getCotizacionDolarBlue() {
		return restTemplate.getForObject("https://api.bluelytics.com.ar/v2/latest", Cotizacion.class);
	}
}
