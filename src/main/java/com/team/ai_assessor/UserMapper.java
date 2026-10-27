package com.team.ai_assessor;

import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserMapper {
    
    @Select("SELECT * FROM sys_user")
    List<User> findAll();

    @Insert("INSERT INTO sys_user(username, password, real_name) VALUES(#{username}, #{password}, #{realName})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(User user);

    @Update("UPDATE sys_user SET username=#{username}, password=#{password}, real_name=#{realName} WHERE id=#{id}")
    int update(User user);

    @Delete("DELETE FROM sys_user WHERE id=#{id}")
    int deleteById(Long id);
}