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
	
	// �Խñ� ��ü ��ȸ ���
	public List<BoardDTO> boardList(){
		return boardMapper.boardList(); 
	}
	
	// �Խñ� �ϳ� ��ȸ
	public BoardDTO boardOne(String no) {
		return boardMapper.boardOne(no);
	}
	
	// �۾���
	public void boardWrite(BoardDTO boardDto) {
		boardMapper.boardWrite(boardDto);
	}
	
	public void boardUpdate(BoardDTO boardDTO) {
		boardMapper.boardUpdate(boardDTO);
	}
	
	public void boardDelete(String no) {
		boardMapper.boardDelete(no);
	}
}
