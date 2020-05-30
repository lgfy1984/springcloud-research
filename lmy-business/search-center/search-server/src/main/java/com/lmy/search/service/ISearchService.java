package com.lmy.search.service;

import com.alibaba.fastjson.JSONObject;
import com.lmy.common.model.PageResult;
import com.lmy.search.model.SearchDto;

import java.io.IOException;

/**
 * @author lmy
 * @date 2019/4/24
 */
public interface ISearchService {
    /**
     * StringQuery通用搜索
     * @param indexName 索引名
     * @param searchDto 搜索Dto
     * @return
     */
    PageResult<JSONObject> strQuery(String indexName, SearchDto searchDto) throws IOException;
}
