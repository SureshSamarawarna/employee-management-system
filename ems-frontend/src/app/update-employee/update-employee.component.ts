import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeListComponent } from '../employee-list/employee-list.component';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit  {
  employee:Employee =new Employee();

  employeeList:EmployeeListComponent | undefined;

  constructor(){

  }
  ngOnInit(): void {
    
  }
  onSubmit(){
    console.log(this.employee);
    
  }

}
