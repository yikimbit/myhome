package com.didimdol.myhome.service;

import com.didimdol.myhome.model.Board;
import com.didimdol.myhome.model.User;
import com.didimdol.myhome.repository.BoardRepository;
import com.didimdol.myhome.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
