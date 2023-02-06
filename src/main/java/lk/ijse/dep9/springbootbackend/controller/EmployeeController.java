package lk.ijse.dep9.springbootbackend.controller;

import lk.ijse.dep9.springbootbackend.model.Employee;
import lk.ijse.dep9.springbootbackend.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("api/v1")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //get all employees
    @GetMapping("employees")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();

    }
    //create employee rest api
    @PostMapping("employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
