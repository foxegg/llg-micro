package indi.micro.module.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import indi.micro.common.domain.system.SysLoginInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: micro
 * @date: 2023/5/22 15:14
 * @description: some desc
 */

@Mapper
public interface SysLoginInfoMapper extends BaseMapper<SysLoginInfo> {
}
