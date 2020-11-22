package com.kr.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dto.UserInfo;
import com.kr.study.service.UserInfoService;

@Controller
public class UserInfoController {

	@Autowired
	UserInfoService service;

	@RequestMapping("readAllUserInfo")
	public ModelAndView readAllUserInfo() {

		ModelAndView mv = service.readAllUserInfo();

		return mv;
	}

	@RequestMapping("moveRegUser")
	public String moveRegUser() {

		return "regUser";
	}

	@RequestMapping("regUser")
	public ModelAndView regUser(@ModelAttribute("regUser") UserInfo userInfo) {

		ModelAndView mv = service.regUser(userInfo);

		return mv;
	}

	@RequestMapping("moveModifyUserInfo")
	public String moveModifyUserInfo() {

		return "modifyUserInfo";
	}

	@RequestMapping("modifyUserInfo")
	public ModelAndView modifyUserInfo(@ModelAttribute("modifyUserInfo") UserInfo userInfo) {

		ModelAndView mv = service.modifyUserInfo(userInfo);

		return mv;
	}

	@RequestMapping("moveDeleteUserInfo")
	public String moveDeleteUserInfo() {

		return "deleteUserInfo";
	}

	@RequestMapping("deleteUserInfo")
	public ModelAndView deleteUserInfo(@ModelAttribute("deleteUserInfo") UserInfo userInfo) {

		ModelAndView mv = service.deleteUserInfo(userInfo);

		return mv;
	}

}
