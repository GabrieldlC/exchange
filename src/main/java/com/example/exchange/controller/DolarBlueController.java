package com.example.exchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exchange.dto.Cotizacion;
import com.example.exchange.service.DolarBlueService;

@RestController
@RequestMapping("/api")
public class DolarBlueController {

	@Autowired
	private DolarBlueService blueService;
	
	@GetMapping
	public Cotizacion getCotizacionDolarBlue() {
		return this.blueService.getCotizacionDolarBlue();
	}
}
