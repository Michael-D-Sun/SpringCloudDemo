package cn.michael.springcloud.Controller;

import cn.michael.springcloud.entities.Dept;
import cn.michael.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Integer id){
        Dept dept = this.service.get(id);
        if(null == dept){
            throw new RuntimeException("This id " + id + "cannot be found.");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Integer id){
        return new Dept(id + " Not found");
    }

    @RequestMapping(value="/dept/list", method = RequestMethod.GET)
    public List<Dept>  list(){
        return service.list();
    }

}
