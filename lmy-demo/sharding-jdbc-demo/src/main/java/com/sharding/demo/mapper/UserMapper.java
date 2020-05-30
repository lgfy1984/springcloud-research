package com.sharding.demo.mapper;

import com.lmy.db.mapper.SuperMapper;
import com.sharding.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lmy
 */
@Mapper
public interface UserMapper extends SuperMapper<User> {

}
