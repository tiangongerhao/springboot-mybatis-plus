package com.yyb.springbootmybatisplus.common.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyb.springbootmybatisplus.common.model.LogInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName LogDao类
 * @Description TODO
 * @Author yyb
 * @Date 2019/5/28 13:48
 * @Vsion 1.0
 **/
@Mapper
public interface LogMapper extends BaseMapper<LogInfo> {

    LogInfo get(Long id);

    List<LogInfo> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    int save(LogInfo log);

    int update(LogInfo log);

    int remove(Long id);

    int batchRemove(Long[] ids);

}
