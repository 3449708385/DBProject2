package com.mgp.dbproject.usermanager.service;

import java.util.List;

import com.mgp.dbproject.usermanager.beans.Menu;

public interface RoleService {
    List<Menu> findMenuById(Long RoleId);
}
