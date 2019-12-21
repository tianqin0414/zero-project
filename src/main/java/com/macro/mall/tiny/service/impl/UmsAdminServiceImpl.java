package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.mapper.UmsAdminMapper;
import com.macro.mall.tiny.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    @Autowired
    private UmsAdminMapper adminMapper;

    @Override
    public int deleteAdmin(Long id) {
        return adminMapper.deleteByPrimaryKey(id);
    }


}
