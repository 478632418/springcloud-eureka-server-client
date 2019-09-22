package com.rp.springcloud.dao;
import com.rp.springcloud.bean.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    Employee selectByPrimaryKey(@Param("id") Integer id);

}