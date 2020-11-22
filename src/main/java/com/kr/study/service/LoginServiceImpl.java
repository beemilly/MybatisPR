package com.kr.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dao.LoginDao;
import com.kr.study.dto.UserInfo;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao dao;

	@Override
	public ModelAndView loginCheck(UserInfo userInfo) {

		String result = dao.loginCheck(userInfo);

		ModelAndView mv = new ModelAndView();

		if(result != null) {
			mv.addObject("id", result);
			mv.setViewName("main");
		} else {
			mv.setViewName("home");
		}

		return mv;
	}

}
