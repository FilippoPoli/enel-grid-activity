package com.enel.permitting.beans;

import java.util.Date;

import com.enel.permitting.entity.CarResult;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class FascicleResult {

	//OUT
	private String as_cdstatofascicolo;
	private String as_cdstatosuccessivo;
	private String as_cdstatoprecedente;
	private Date ad_dttermineprevista;
	private String as_listastati;
	private String as_repaintgraph;
	private Integer an_major_code;
	private Integer an_minor_code;
	private String as_major_msg;
	private String as_minor_msg;
	

}
