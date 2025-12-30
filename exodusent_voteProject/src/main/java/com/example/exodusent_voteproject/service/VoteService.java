package com.example.exodusent_voteproject.service;

import com.example.exodusent_voteproject.domain.Vote;
import com.example.exodusent_voteproject.exception.CustomException;
import com.example.exodusent_voteproject.exception.ErrorCode;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    private final Vote vote = new Vote();

    public void vote(String choice) {
        if (!"jajang".equals(choice) && !"jjamppong".equals(choice)) {
            throw new CustomException(ErrorCode.INVALID_CHOICE);
        }
        vote.vote(choice);
    }

    public Vote getResult() {
        return vote;
    }
}
