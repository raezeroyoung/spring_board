package com.myprj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprj.dto.BoardDTO;
import com.myprj.mapper.BoardMapper;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	// 게시글 전체 조회 기능
	public List<BoardDTO> boardList(){
		return boardMapper.boardList(); 
	}
	
	// 게시글 하나 조회
	public BoardDTO boardOne(String no) {
		return boardMapper.boardOne(no);
	}
	
	// 글쓰기
	public void boardWrite(BoardDTO boardDto) {
		boardMapper.boardWrite(boardDto);
	}
	
	
}
