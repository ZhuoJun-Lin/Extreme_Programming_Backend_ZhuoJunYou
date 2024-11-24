package org.example.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.example.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeMapper {


    List<Employee> selectAll(Employee employee);

    List<Employee> selectMapFav(Employee employee);

    @Select("select  * from 'user' where id = #{id}")
    Employee selectById(Integer id);

    void insert(Employee employee);

    void updateById(Employee employee);

    @Delete("delete from `user` where id = #{id}")
    void deleteById(Integer id);
}
