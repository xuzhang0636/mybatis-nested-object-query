package com.xuzhang.mybatisnestedobjectquery.mapper;

import com.xuzhang.mybatisnestedobjectquery.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findUserById(@Param("userId") Long userId);
    User findUserRole();
}
