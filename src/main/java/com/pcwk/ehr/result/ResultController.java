package com.pcwk.ehr.result;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ResultController {

	@Autowired
	ResultService resultService;
	
	
	@RequestMapping(value = "/result/getId.do")
	public String getId(ResultVO search, Model model) throws SQLException{
		
		System.out.println("Client request received: " + search.toString());

		ResultVO outVO = resultService.getId(search);
		model.addAttribute("outVO", outVO);
		
		List<ResultVO> list = resultService.getLuck(search);
		model.addAttribute("list", list);

		return "user/Ne05_MemberResultPage";
		
		
	}
	
	@RequestMapping(value = "/result/getLuck.do")
	public String getLuck(ResultVO search, Model model) throws SQLException{
		
		System.out.println("Client request received: " + search.toString());

		List<ResultVO> list = resultService.getLuck(search);
		model.addAttribute("list", list);

		return "user/Ne05_MemberResultPage";
	}
}
