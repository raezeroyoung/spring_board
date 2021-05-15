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
	
	// �Խñ� ��� ��ȸ
	public List<BoardDTO> boardList(){
		return sql.selectList("boardList");
	}
	
	// �Խñ� �ϳ� ��ȸ
	public BoardDTO boardOne(String no) {
		return sql.selectOne("boardOne", no);
	}
	
	// �۾���
	public void boardWrite(BoardDTO boardDto) {
		sql.insert("boardWrite", boardDto);
	}
	
	public void boardUpdate(BoardDTO boardDTO) {
		sql.update("boardUpdate",boardDTO);
	}
	
	public void boardDelete(String no) {
		sql.delete("boardDelete",no);
	}
}
