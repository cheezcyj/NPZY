package com.pcwk.ehr.signUp;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcwk.ehr.signUp.SignUpVO;
import com.pcwk.ehr.signUp.SignUpService;


@Controller()
@RequestMapping("")
public class SignUpController {
	
	final Logger LOG = LogManager.getLogger(getClass());
	
	/**
	 *     회원가입 페이지 접속 주소
	 */
	@Autowired
	SignUpService signUpService;

	//회원가입 창 
	@RequestMapping(value = "/user/SignUp.do" , method = RequestMethod.GET
			,produces = "application/json;charset=UTF-8"
			)
	public String goLogin(SignUpVO signUpVO, Model model) throws SQLException, ClassNotFoundException{
		
		LOG.debug("----------------");
		LOG.debug("/user/SignUp.do 화면이 켜졌습니다!!!!!");   
		LOG.debug("----------------");
		LOG.debug("현재 값은 :"+signUpVO);
		
			return "user/Ne08_SignUp";
			
	}

		
	

	/**
	 * 회원가입 버튼 누를 시  DB입력 되는 주소 (회원 가입 노란버튼)
	 * @throws ClassNotFoundException 
	 */
	@RequestMapping(value = "/user/Login.do", method = RequestMethod.GET	
			,produces = "application/json;charset=UTF-8"
			)
	@ResponseBody
	public String SaveUserInfo(SignUpVO userInfo, Model model)throws SQLException, ClassNotFoundException {
		
		
		LOG.debug("############################## 회원가입 누르셨습니다. 아래에는 들어온 데이터 ! ");
		LOG.debug("inVO:"+userInfo);
		LOG.debug("############################## 회원가입 누르셨습니다. 위에는 들어온 데이터 ! ");

		
		int flag = this.signUpService.add(userInfo);
		
		if(flag==1) {
			return "user/Ne07_Login";
		}else {
			return "회원가입이 실패했어요...ㅜㅜ";
		}
		
	
	}	
	

	
	
	
	//아이디 중복체크
	@PostMapping(value = "/user/checkDuplicate.do", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public int idCheck(@RequestParam("userId") String userId) throws Exception {
		
		int cnt = signUpService.idCheck(userId);
		
		return cnt;
		
	}
	
	
	
}	
		
	
	
	

