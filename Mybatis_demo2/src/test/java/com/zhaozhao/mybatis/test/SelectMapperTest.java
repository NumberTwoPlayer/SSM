package com.zhaozhao.mybatis.test;

import com.zhaozhao.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author 刘梹晨
 * @Classname SelectMapper
 * @Date 2023/7/26 14:49
 */

public class SelectMapper {

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        mapper.testGetUserById(1);

    }
}
