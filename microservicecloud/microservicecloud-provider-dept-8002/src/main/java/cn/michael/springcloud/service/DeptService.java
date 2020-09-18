package cn.michael.springcloud.service;

import cn.michael.springcloud.dao.entities.Dept;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {

    boolean addDept(Dept dept);

    Dept get(Integer id);

    List<Dept> list();
}
