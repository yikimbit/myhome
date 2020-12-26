package com.didimdol.myhome.controller;

import com.didimdol.myhome.model.Board;
import com.didimdol.myhome.repository.BoardRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardRepositroy boardRepositroy;

    @GetMapping("/list")
    public String list(Model model) {
        List<Board> boards = boardRepositroy.findAll();
        model.addAttribute("boards", boards);
        return "board/list";
    }

    @GetMapping("/form")
    public String form(Model model) {
        return "board/form";
    }
}
