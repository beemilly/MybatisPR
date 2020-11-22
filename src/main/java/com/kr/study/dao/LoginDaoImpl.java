package com.kr.study.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kr.study.dto.UserInfo;
@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	SqlSessionTemplate sqlsession;

	@Override
	public String loginCheck(UserInfo userInfo) {

		String result = sqlsession.selectOne("Login.selectId", userInfo);

		return result;
	}

}
