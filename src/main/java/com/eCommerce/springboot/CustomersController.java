package com.eCommerce.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
//@CrossOrigin(origins = "http://localhost:8080") 
public class CustomersController {

	@Autowired
	private CustomersRepository customersRepository;
	
	@GetMapping()
	public List<Customers> getAllCustomer(){
		return customersRepository.findAll();
	}
	
	@PostMapping()
	public Customers addCustomers(@RequestBody Customers addCustomers) {
		customersRepository.save(addCustomers);
		return addCustomers;
	}
	
	@GetMapping("/{id}")
	public Customers getCustomers(@PathVariable Long id) {
		return customersRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found! :[ "));
	}
	
	//Updates the customer information
	@PutMapping("/{id}")
	public Customers updateCustomers(@PathVariable Long id, @RequestBody Customers customerDetails) {
		Customers c = customersRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found!"));
		c.setName(customerDetails.getName());
		c.setEmail(customerDetails.getEmail());
		c.setPhone(customerDetails.getPhone());
		c.setBookingDate(customerDetails.getBookingDate());
		c.setBookingTime(customerDetails.getBookingTime());
		c.setNumOfGuest(customerDetails.getNumOfGuest());
		return customersRepository.save(c);
	}
	
	//Delete
	@DeleteMapping("/{id}")
		public void deleteCustomer(@PathVariable Long id) {
		customersRepository.deleteById(id);
	}
	

}
