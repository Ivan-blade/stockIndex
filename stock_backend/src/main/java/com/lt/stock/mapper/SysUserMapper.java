package com.lt.stock.mapper;

import com.lt.stock.pojo.SysUser;

/**
* @author teng
* @description 针对表【sys_user(用户表)】的数据库操作Mapper
* @createDate 2023-01-06 18:23:05
* @Entity com.lt.stock.pojo.SysUser
*/
public interface SysUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

}
