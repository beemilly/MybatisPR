package com.kr.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kr.study.dao.UserInfoDao;
import com.kr.study.dto.UserInfo;
@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoDao dao;

	@Override
	public ModelAndView readAllUserInfo() {

		List<UserInfo> resultList = dao.readAllUserInfo();

		ModelAndView mv = new ModelAndView();

		if(resultList != null) {
			mv.addObject("userInfoList", resultList);
			mv.setViewName("userInfoAll");
		} else {
			mv.setViewName("errorPage");
		}

		return mv;
	}

	@Override
	public ModelAndView regUser(UserInfo userInfo) {

		int result = dao.resUser(userInfo);

		ModelAndView mv = new ModelAndView();
		if(result > 0) {
			mv.addObject("msg","회원가입이 완료되었습니다.");
			mv.setViewName("home");
		} else {
			mv.setViewName("errorPage");
		}

		return mv;
	}

	@Override
	public ModelAndView modifyUserInfo(UserInfo userInfo) {

		int result = dao.modifyUserInfo(userInfo);

		ModelAndView mv = new ModelAndView();
		if(result > 0) {
			mv.setViewName("redirect:readAllUserInfo");
		} else {
			mv.setViewName("errorPage");
		}

		return mv;
	}

	@Override
	public ModelAndView deleteUserInfo(UserInfo userInfo) {

		int result = dao.deleteUserInfo(userInfo);

		ModelAndView mv = new ModelAndView();
		if(result > 0) {
			mv.setViewName("redirect:readAllUserInfo");
		} else {
			mv.setViewName("errorPage");
		}

		return mv;
	}

}
