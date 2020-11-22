package com.kr.study.dao;

import java.util.List;

import com.kr.study.dto.UserInfo;

public interface UserInfoDao {

	List<UserInfo> readAllUserInfo();

	int resUser(UserInfo userInfo);

	int modifyUserInfo(UserInfo userInfo);

	int deleteUserInfo(UserInfo userInfo);

}
