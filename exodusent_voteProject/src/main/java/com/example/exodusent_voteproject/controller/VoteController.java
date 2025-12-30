package com.example.exodusent_voteproject.controller;

import com.example.exodusent_voteproject.service.VoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VoteController {

    private final VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    // 투표 페이지
    @GetMapping("/vote")
    public String votePage() {
        return "vote";
    }

    // 투표 처리 (상태 변경)
    @PostMapping("/vote")
    public String submitVote(@RequestParam String choice) {
        voteService.vote(choice);
        return "redirect:/result";
    }

    // 결과 페이지 (상태 조회)
    @GetMapping("/result")
    public String resultPage(Model model) {
        model.addAttribute("result", voteService.getResult());
        return "result";
    }
}
