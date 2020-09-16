package cn.michael.springcloud.Controller;

import cn.michael.springcloud.dao.entities.Dept;
import cn.michael.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value="/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return service.addDept(dept);
    }

    @RequestMapping(value="/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Integer id){
        System.out.println(service.get(id));
        return service.get(id);
    }

    @RequestMapping(value="/dept/list", method = RequestMethod.GET)
    public List<Dept>  list(){
        return service.list();
    }

}
