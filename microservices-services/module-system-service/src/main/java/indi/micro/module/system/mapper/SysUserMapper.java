package indi.micro.module.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import indi.micro.common.domain.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: micro
 * @date: 2023/5/22 15:09
 * @description: SysUserMapper
 */

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}
