package cn.michael.springcloud.dao;

import cn.michael.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Integer id);

    List<Dept> findAll();
}
