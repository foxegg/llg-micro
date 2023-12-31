package indi.micro.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import indi.micro.auth.module.CurrentUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: micro
 * @date: 2023/5/20 13:09
 * @description: 用户 mapper
 */

@Mapper
public interface SysCurrentUserMapper extends BaseMapper<CurrentUser> {
}
