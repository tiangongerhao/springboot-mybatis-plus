package com.yyb.springbootmybatisplus.common;

import com.yyb.springbootmybatisplus.common.model.LogInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author yyb
 * @Description 系统日志
 * @Date 2019/5/28
 **/
@Mapper
public interface LogDao {
    LogInfo get(Long id);

    List<LogInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    int save(LogInfo log);

    int update(LogInfo log);

    int remove(Long id);

    int batchRemove(Long[] ids);
}
