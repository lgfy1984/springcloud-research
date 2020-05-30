package com.lmy.oauth.service;

import com.lmy.common.model.PageResult;
import com.lmy.common.model.Result;
import com.lmy.common.service.ISuperService;
import com.lmy.oauth.model.Client;

import java.util.Map;

/**
 * @author lmy
 * <p>
 * Blog: https://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
public interface IClientService extends ISuperService<Client> {
    Result saveClient(Client clientDto) throws Exception;

    /**
     * 查询应用列表
     * @param params
     * @param isPage 是否分页
     */
    PageResult<Client> listClient(Map<String, Object> params, boolean isPage);

    void delClient(long id);
}
