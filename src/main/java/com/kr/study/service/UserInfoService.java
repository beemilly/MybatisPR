package com.kr.study.service;

import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dto.UserInfo;

public interface UserInfoService {

	ModelAndView readAllUserInfo();

	ModelAndView regUser(UserInfo userInfo);

	ModelAndView modifyUserInfo(UserInfo userInfo);

	ModelAndView deleteUserInfo(UserInfo userInfo);

}
