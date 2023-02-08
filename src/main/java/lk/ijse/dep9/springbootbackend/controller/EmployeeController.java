package lk.ijse.dep9.springbootbackend.controller;

import lk.ijse.dep9.springbootbackend.exception.ResourceNotFoundException;
import lk.ijse.dep9.springbootbackend.model.Employee;
import lk.ijse.dep9.springbootbackend.repository.EmployeeRepository;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id " + id));
        return ResponseEntity.ok(employee);
    }
}
