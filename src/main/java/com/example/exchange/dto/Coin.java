package com.example.exchange.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coin {

	@JsonProperty("value_avg")
	private double valueAvg;
	@JsonProperty("value_sell")
	private double valueSell;
	@JsonProperty("value_buy")
	private double valueBuy;
}
