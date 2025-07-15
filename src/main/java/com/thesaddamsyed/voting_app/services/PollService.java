package com.thesaddamsyed.voting_app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.thesaddamsyed.voting_app.models.Poll;
import com.thesaddamsyed.voting_app.repositories.PollRepository;

@Service
public class PollService {

    private final  PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }

    public List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }

    public Optional<Poll> getPollById(Long id) {
        return pollRepository.findById(id);
    }

}
