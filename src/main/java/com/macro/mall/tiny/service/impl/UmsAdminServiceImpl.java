package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.mapper.UmsAdminMapper;
import com.macro.mall.tiny.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;

public class UmsAdminServiceImpl implements UmsAdminService {
    @Autowired
    private UmsAdminMapper UmsAdminMapper;

    @Override
    public int deleteAdmin(Long id) {
        return UmsAdminMapper.deleteByPrimaryKey(id);
    }


}
