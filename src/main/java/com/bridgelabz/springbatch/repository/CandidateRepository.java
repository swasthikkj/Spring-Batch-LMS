package com.bridgelabz.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.springbatch.model.CandidateModel;

public interface CandidateRepository extends JpaRepository<CandidateModel, Long> {

}
