package com.promineotech.jeep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineotech.jeep.entity.Jeep;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultJeepSalesService implements JeepSalesService {
//	@Autowired
//	  private JeepSalesService jeepSalesService;

	@Override
	public List<Jeep> fetchJeeps(String model, String trim) {
		log.info("The fetchJeep method was called with model={} and trim={}", 
				model, trim);
		
//		return jeepSalesService.fetchJeeps(model, trim);
		return null;
	}

}
