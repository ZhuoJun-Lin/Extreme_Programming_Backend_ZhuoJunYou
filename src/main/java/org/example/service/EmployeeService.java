package org.example.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jakarta.annotation.Resource;
import org.example.entity.Employee;
import org.example.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    public void update(Employee employee) {
        employeeMapper.updateById(employee);
    }

    public void add(Employee employee) {
        employeeMapper.insert(employee);
    }

    public void deleteById(Integer id) {
        employeeMapper.deleteById(id);
    }


    public Employee selectById(Integer id) {
        return employeeMapper.selectById(id);
    }

    public List<Employee> selectAll(Employee employee) {
        return employeeMapper.selectAll(employee);
    }



    public PageInfo<Employee> selectPage(Employee employee, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Employee> list = employeeMapper.selectAll(employee);
        return PageInfo.of(list);
    }

    public PageInfo<Employee> selectPageFav(Employee employee, Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Employee> list = employeeMapper.selectMapFav(employee);
        return PageInfo.of(list);
    }


    public void deleteBatch(List<Integer> ids) {
        for (Integer id : ids){
            this.deleteById(id);
        }
    }
}
