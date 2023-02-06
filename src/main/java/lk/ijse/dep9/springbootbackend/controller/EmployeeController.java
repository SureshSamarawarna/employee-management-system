package lk.ijse.dep9.springbootbackend.controller;

import lk.ijse.dep9.springbootbackend.model.Employee;
import lk.ijse.dep9.springbootbackend.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("api/v1")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("employees")                     //get all employees
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
}
