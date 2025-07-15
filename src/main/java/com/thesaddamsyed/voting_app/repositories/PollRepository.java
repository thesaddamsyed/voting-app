package com.thesaddamsyed.voting_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thesaddamsyed.voting_app.models.Poll;

@Repository
public interface PollRepository extends JpaRepository<Poll, Long>{

}
