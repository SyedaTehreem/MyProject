package com.test.MyProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController
{
    //Repository declared
    @Autowired
    private TestRepository testRepository;

    @GetMapping("/customer")
    public List<CustomerEntity> getDataFromTable() {
        return testRepository.findAll();
    }
    /////Process for CRUD Operations,"Get"
    @RequestMapping("/{id}")
    public CustomerEntity getSpecificCustomerEntity(@PathVariable("id") Integer id){
        return testRepository.getOne(id);
    }
    ////For Insert
    @RequestMapping(method = RequestMethod.POST,value = "/customer")
    public void saveCustomerEntity(@RequestBody CustomerEntity customerEntity){
        testRepository.save(customerEntity);
    }
    ////for delete
    @RequestMapping(method = RequestMethod.DELETE,value = "{id}")
    public void deleteCustomerEntity(@PathVariable Integer id){
        testRepository.deleteById(id);

    }
}
