package com.mgp.dbproject.usermanager.dao;

import com.mgp.dbproject.usermanager.beans.RoleRelationMenu;

public interface RoleRelationMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleRelationMenu record);

    int insertSelective(RoleRelationMenu record);

    RoleRelationMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleRelationMenu record);

    int updateByPrimaryKey(RoleRelationMenu record);
}