package com.wljcompany.demo.mapper;

import com.wljcompany.demo.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from users")
    List<User> findAll();

    @Insert("INSERT INTO users (name, sex, age) VALUES (#{name}, #{sex}, #{age})")
    void create(User user);

    @Select("SELECT * FROM users WHERE id = #{id} LIMIT 1")
    User findById(Long id);

    @Update("UPDATE users SET name = #{user.name}, sex = #{user.sex}, age = #{user.age} WHERE id = #{id}")
    void updateUser(@Param("id") Long id, @Param("user") User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteUser(@Param("id") Long id);
}
