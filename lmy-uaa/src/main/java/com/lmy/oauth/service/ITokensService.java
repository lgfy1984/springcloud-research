package com.lmy.oauth.service;

import com.lmy.common.model.PageResult;
import com.lmy.oauth.model.TokenVo;

import java.util.Map;

/**
 * @author lmy
 */
public interface ITokensService {
    /**
     * 查询token列表
     * @param params 请求参数
     * @param clientId 应用id
     */
    PageResult<TokenVo> listTokens(Map<String, Object> params, String clientId);
}
