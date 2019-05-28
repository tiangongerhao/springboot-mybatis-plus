package com.yyb.springbootmybatisplus.common.service;

import com.yyb.springbootmybatisplus.common.model.LogInfo;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
    void save(LogInfo logInfo);
//    PageDO<LogInfo> queryList(Query query);
    int remove(Long id);
    int batchRemove(Long[] ids);
}
