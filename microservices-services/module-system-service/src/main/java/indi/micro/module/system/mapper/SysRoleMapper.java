package indi.micro.module.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import indi.micro.common.domain.system.SysRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: micro
 * @date: 2023/5/22 15:12
 * @description: SysRoleMapper
 */

@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
}
