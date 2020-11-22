package com.kr.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kr.study.dto.UserInfo;
@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	@Autowired
	SqlSessionTemplate sqlsession;

	@Override
	public List<UserInfo> readAllUserInfo() {

		List<UserInfo> resultList = sqlsession.selectList("UserInfo.selectAll");

		return resultList;
	}

	@Override
	public int resUser(UserInfo userInfo) {

		int result = sqlsession.insert("UserInfo.insert", userInfo);

		return result;
	}

	@Override
	public int modifyUserInfo(UserInfo userInfo) {

		int result = sqlsession.update("UserInfo.update", userInfo);

		return result;
	}

	@Override
	public int deleteUserInfo(UserInfo userInfo) {

		int result = sqlsession.delete("UserInfo.delete", userInfo);

		return result;
	}

}
