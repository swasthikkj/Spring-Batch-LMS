package com.bridgelabz.springbatch.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.bridgelabz.springbatch.model.CandidateModel;

@Component
public class Processor implements ItemProcessor<CandidateModel, CandidateModel> {

	private static final Map<String, String> DEGREE = new HashMap<>();
	
	public Processor() {
		DEGREE.put("1", "BSc");
		DEGREE.put("2", "BE");
		DEGREE.put("3", "BTech");
	}
	
	@Override
	public CandidateModel process(CandidateModel model) throws Exception {
		String degreeCode = model.getDegree();
		String degree = DEGREE.get(degreeCode);
		model.setDegree(degree);
		System.out.println(String.format("Converted from [%s] to [%s]", degreeCode, degree));
		return model;
	}
}
