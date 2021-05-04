package com.marigold.shoes.view.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.marigold.shoes.domain.ShoesService;
import com.marigold.shoes.domain.ShoesVO;

@Controller
@SessionAttributes("shoes")
public class ShoesController {
	
	@Autowired
	private ShoesService shoesService;
	
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String, String> conditionMap = new HashMap<String, String>();
		
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		conditionMap.put("작성자", "WRITER");
		
		return conditionMap;
	}

	@RequestMapping(value="/insertShoes.do")
	public String insertBoard(ShoesVO vo) throws IOException {
		System.out.println("글 등록 처리");
		shoesService.insertShoes(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping(value="/deleteShoes.do")
	public String deleteOneShoes(int article) {
		System.out.println("글 삭제 처리");
		shoesService.deleteOneShoes(article);
		return "getBoardList.do";
	}
	
	@RequestMapping(value="/updateShoes.do")
	public String updateShoes(@ModelAttribute("shoes")ShoesVO vo) {
		System.out.println("글 수정 처리");
		shoesService.updateShoes(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping(value="/getOne.do")
	public String getOne(ShoesVO vo, Model mod) {
		System.out.println("글 상세 조회 처리");
		ShoesVO shoes = shoesService.getOne(vo);
		mod.addAttribute("shoes", shoes);
		return "getBoard.jsp";
	}
	
	@RequestMapping(value="/getList.do")
	public String getList(ShoesVO vo, Model mod) {
		System.out.println("글 목록 검색 처리");
		
//		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
//		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		
		List<ShoesVO> boardList = shoesService.getList(vo);
		mod.addAttribute("boardList", boardList);
		return "getBoardList.jsp";
	}
	
	@RequestMapping(value="/dataTransform.do")
	@ResponseBody
	public List<ShoesVO> dataTransform(ShoesVO vo){
//		vo.setSearchCondition("TITLE");
//		vo.setSearchKeyword("");
		
		List<ShoesVO> boardList = shoesService.getList(vo);
		return boardList;
	}
	
	@RequestMapping(value="/checkBoxList.do")
	 @ResponseBody 
	 public void checkBoxList(
			 HttpServletRequest request, 
			 HttpServletResponse response,
			 @RequestParam(value="firstCategory", required = false) List<String> firstCategory,
			 @RequestParam(value="secondCategory", required = false) List<String> secondCategory,
			 @RequestParam(value="thirdCategory", required = false) List<String> thirdCategory,
			 @RequestParam(value="material", required = false) List<String> material,
			 @RequestParam(value="brand", required = false) List<String> brand,
			 @RequestParam(value="price", required = false) List<String> price
			 ) {
		
	}
	/*
	@RequestMapping(value="/dataTransformXml.do")
	@ResponseBody
	public BoardTbListVO dataTransformXml(ShoesVO vo){
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<ShoesVO> list = shoesService.getList(vo);
		
		BoardTbListVO boardList = new BoardTbListVO();
		boardList.setBoardList(list);
		return boardList;
	}
 */
}
