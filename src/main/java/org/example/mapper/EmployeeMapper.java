package org.example.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.example.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public abstract class EmployeeMapper {


    public abstract List<Employee> selectAll(Employee employee);

    public abstract List<Employee> selectMapFav(Employee employee);

    @Select("select  * from 'user' where id = #{id}")
    public abstract Employee selectById(Integer id);

    public abstract void insert(Employee employee);

    public abstract void updateById(Employee employee);

    @Delete("delete from `user` where id = #{id}")
    public abstract void deleteById(Integer id);
}
