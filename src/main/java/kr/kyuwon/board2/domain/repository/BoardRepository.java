package kr.kyuwon.board2.domain.repository;

import kr.kyuwon.board2.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findAllByOrderByModifiedDateDesc();
}
