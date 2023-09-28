package com.example.exchange.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cotizacion {

	@JsonProperty("oficial")
	private Coin oficial;
	@JsonProperty("blue")
	private Coin blue;
	@JsonProperty("oficial_euro")
	private Coin oficialEuro;
	@JsonProperty("blue_euro")
	private Coin blueEuro;
	@JsonProperty("last_update")
	private Date lastUpdate;
}
