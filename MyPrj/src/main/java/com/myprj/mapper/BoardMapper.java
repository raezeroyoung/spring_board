package com.myprj.mapper;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myprj.dto.BoardDTO;

@Component
public class BoardMapper {
	
	@Autowired
	private SqlSessionTemplate sql;
	//selectList
	//selectOne
	//insert
	//update
	//delete
	
	// 게시글 목록 조회
	public List<BoardDTO> boardList(){
		return sql.selectList("boardList");
	}
	
	// 게시글 하나 조회
	public BoardDTO boardOne(String no) {
		return sql.selectOne("boardOne", no);
	}
	
	// 글쓰기
	public void boardWrite(BoardDTO boardDto) {
		sql.insert("boardWrite", boardDto);
	}
}
