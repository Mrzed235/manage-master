package com.yeqifu.sys.mapper;

import com.yeqifu.sys.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 9216 kB Mapper 接口
 * </p>
 *
 * @author 空城-
 * @since 2023-03-16
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    /**
     * 根据权限ID或菜单ID删除sys_role_permission表里面的数据
     * @param id
     */
    void deleteRolePermissionByPid(@Param("id") Serializable id);
}
