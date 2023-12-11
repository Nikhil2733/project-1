package com.bhoumik.bhoumikdemo;

import com.bhoumik.bhoumikdemo.model.Employee;
import com.bhoumik.bhoumikdemo.repository.EmployeeRepository;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Setter
@ToString
@SpringBootApplication
public class BhoumikdemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BhoumikdemoApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setfirstName("Nikhil");
		employee.setlastName("lihkiN");
		employee.setemailId("nikhil@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setfirstName("Kushal");
		employee1.setlastName("Chennareddy");
		employee1.setemailId("kushal@gmail.com");
		employeeRepository.save(employee1);
	}
}
