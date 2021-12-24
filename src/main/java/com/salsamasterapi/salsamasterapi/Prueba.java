package com.salsamasterapi.salsamasterapi;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Prueba {

    @GetMapping(path="/swede", produces = "application/json")
    public List<Employee> getEmployees()
    {
        System.out.println("SVENSKAAAAAAAAAAAAA !!");
        List<Employee> arr= new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Employee o= new Employee(i,"name "+i,"","");
            arr.add(o);
        }
        return arr;
    }


    public class Employee {


        public Employee(Integer id, String firstName, String lastName, String email) {
            super();
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        private Integer id;
        private String firstName;
        private String lastName;
        private String email;

        //Getters and setters

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


    }
}
