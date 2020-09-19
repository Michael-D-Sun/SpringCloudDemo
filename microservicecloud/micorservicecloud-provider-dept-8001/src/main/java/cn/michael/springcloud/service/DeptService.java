package cn.michael.springcloud.service;

import cn.michael.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept get(Integer id);

    List<Dept> list();
}
