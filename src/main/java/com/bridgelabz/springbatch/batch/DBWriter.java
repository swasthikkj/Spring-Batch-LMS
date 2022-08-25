package com.bridgelabz.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgelabz.springbatch.model.CandidateModel;
import com.bridgelabz.springbatch.repository.CandidateRepository;

@Component
public class DBWriter implements ItemWriter<CandidateModel> {
	@Autowired
	private CandidateRepository candidateRepository;
	
	@Override
	public void write(List<? extends CandidateModel> items) throws Exception {
		System.out.println("Data saved for candidates: " + items);
		candidateRepository.saveAll(items);		
	}
}
