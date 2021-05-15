package com.myprj.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myprj.dto.BoardDTO;
import com.myprj.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	//�Խ���
	@GetMapping("boards")
	public String boards(Model model) {
		List<BoardDTO> list = boardService.boardList();
		model.addAttribute("list",list);
		return "board/board";
	}
	
	@GetMapping("board/{no}")
	public String boardOne(@PathVariable String no, Model model) {
		
		//@RequestParam("no") String no
		//board?no=1
		
		
		//@PathVariable
		//board/1
		
		BoardDTO boardDto = boardService.boardOne(no);
		model.addAttribute("boardDto", boardDto);
		
		return "board/boardDetail";
	}
	
	@GetMapping("write")
	public String boardWrite() {
		return "board/write";
	}
	
	@PostMapping("write")
	public String writeOk(HttpServletRequest request,BoardDTO boardDto) {
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String userId = request.getParameter("userId");
		
		boardDto.setTitle(title);
		boardDto.setContents(contents);
		boardDto.setUserId(userId);
		
		boardService.boardWrite(boardDto);
		
		
		return "redirect:/boards";
//		return " board/list";
		
		//redirect 
	}
	
	@GetMapping("board/update")
	public String update(@RequestParam("no") String no, Model model) {
		BoardDTO boardDto = boardService.boardOne(no);
		model.addAttribute("boardDto", boardDto);
		
		
		return "board/update";
	}
	@PutMapping("board/updateOK")
	public String updateOk(BoardDTO boardDto,HttpServletRequest request) {
		String no = request.getParameter("no");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String userId = request.getParameter("userId");
		
		boardDto.setNo(no);
		boardDto.setTitle(title);
		boardDto.setContents(contents);
		boardDto.setUserId(userId);
		boardService.boardUpdate(boardDto);
		System.out.println(boardDto);
		return "redirect:/boards";
	}
	
	@RequestMapping("board/delete/{no}")
	public String deleteOk(@PathVariable String no) {
		boardService.boardDelete(no);
		return "redirect:/boards";
	}
}
