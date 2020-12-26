package com.didimdol.myhome.repository;

import com.didimdol.myhome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepositroy extends JpaRepository<Board, Long> {
}
