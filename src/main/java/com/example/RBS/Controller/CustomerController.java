package com.example.RBS.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import com.example.RBS.Entity.Loan;
import com.example.RBS.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.RBS.Entity.Customer;
import com.example.RBS.Repository.CustomerRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class CustomerController {

	@Autowired
	LoanRepository loanRepo;


	@GetMapping("/getCustomer")
	public List<Loan> getCustomers() {

		Customer customer = new Customer();
		customer.customerId = 1;
		customer.customerName = "Vamsi";
		customer.address = "Hyderabad";
		customer.pan = "ABCD123";

		Loan loan1 = new Loan();
		loan1.loanId = 1;
		loan1.loanAmount = 100000;
		loan1.loanType = "Education";
		loan1.customer=customer;


		Loan loan2 = new Loan();
		loan2.loanId = 2;
		loan2.loanAmount = 200000;
		loan2.loanType = "Agriculture";
		loan2.customer=customer;



		List<Loan> list = new ArrayList<>();

		list.add(loan1);
		list.add(loan2);

        return loanRepo.saveAll(list);
	}

	@GetMapping("loandetails/{id}")
	public Loan getLoanDetails(@PathVariable int id){
		return loanRepo.findById(id).get();

	}

}
