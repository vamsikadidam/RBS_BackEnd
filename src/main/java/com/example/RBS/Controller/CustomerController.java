package com.example.RBS.Controller;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RBS.Entity.Customer;
import com.example.RBS.Repository.CustomerRepository;

@RestController
@CrossOrigin(origins="*")
public class CustomerController {
	
//	@Autowired
//	private CustomerRepository customerRepository;
	
	@GetMapping("customer")
	public List<Customer> getCustomers(){
		
		return Stream.of(new Customer("12345", "vk","address","ABCDE1234F","String@1"),
				new Customer("12346", "vk1","addressArea","ABCDE1234G","String@1"),
				new Customer("12347", "vk2","addressPlace","ABCDE1234H","String@1")).collect(Collectors.toList());
				
//				this.customerRepository.findAll();
	}

}
