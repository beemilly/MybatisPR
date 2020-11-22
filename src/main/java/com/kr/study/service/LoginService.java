package com.kr.study.service;

import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dto.UserInfo;

public interface LoginService {

	ModelAndView loginCheck(UserInfo userInfo);

}
