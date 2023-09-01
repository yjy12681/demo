package com.example.demo.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SWSpecVO {
	private int spec_num;
	private String sw_mfg;
	private String spec_siriel;
	private String spec_warranty;
	
	

	
}
