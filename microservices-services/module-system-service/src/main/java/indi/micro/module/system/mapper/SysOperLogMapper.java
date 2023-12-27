package indi.micro.module.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import indi.micro.common.domain.system.SysOperLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: micro
 * @date: 2023/5/22 15:11
 * @description: SysOperLogMapper
 */

@Mapper
public interface SysOperLogMapper extends BaseMapper<SysOperLog> {
}
