package com.zhao.mybatis.test;

import com.zhao.mybatis.mapper.DynamicSQLMapper;
import com.zhao.mybatis.pojo.Emp;
import com.zhao.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author 刘梹晨
 * @Classname DynamicSQLMapperTest
 * @Date 2023/7/28 11:34
 */

public class DynamicSQLMapperTest {
    /**
     * 动态SQL：
     * 1、if:根据标签中test属性所对应的表达式决定标签中的内容是否需要拼接到SQL中
     *
     * 2、where：
     * 当where标签中有内容时，会自动生成where关键字，并且将内容前多余的and 或 or去掉
     * 当where标签中没有内容时，此时where标签没有任何效果
     * 注意：where标签不能将其中内容后面多余的and或or去掉
     *
     * 3、trim：
     * 若标签中有内容时：
     * prefix/suffix：将trim标签中内容前面或后面添加指定内容
     * suffixOverrides/prefixOverrides：将trim标签中内容前面或后面去掉指定内容
     * 若标签中没有内容，trim标签也没有任何效果
     *
     * 4、choose、when、otherwise，相当于if...else if...else
     *  when至少要有一个，otherwise最多只能有一个
     *
     * 5、foreach
     *  collection：设置需要循环的数组或集合
     *  item：表示数据或集合中的每一个数据
     *  separator：循环体之间的分隔符
     *  open：foreach标签所循环的所有内容的开始符
     *  close：foreach标签所循环的所有内容的结束符
     *
     * 6、sql标签
     *  设置SQL片段：<sql id="empColumns">eid,emp_name,age,sex,email</sql>
     *  引用SQL片段：select <include refid="empColumns"/> from t_emp
     */

    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpByCondition(new Emp(null,"zhaozhao",null,"",""));
        System.out.println(list);
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> list = mapper.getEmpByChoose(new Emp(null, "", null, "男", ""));
        System.out.println(list);
    }

    @Test
    public void testDeleteMoreByArray(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int result = mapper.deleteMoreBuArray(new Integer[]{3, 4});
        System.out.println(result);
    }

    @Test
    public void testinsertByList(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "zhaozhao", 20, "女", "123456@qq.com");
        Emp emp2 = new Emp(null, "chen", 20, "男", "112233@qq.com");
        List<Emp> list = Arrays.asList(emp1, emp2);
        System.out.println(mapper.insertMoreByList(list));

    }
}
