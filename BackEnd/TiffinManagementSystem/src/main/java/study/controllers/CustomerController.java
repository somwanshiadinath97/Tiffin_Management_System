package study.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import study.entities.CustomerDetails;
import study.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository custrepo;
	
	@PostMapping("/addcustomer")
	public String addCustomer(@RequestBody CustomerDetails customer) 
	{
		CustomerDetails obj = new CustomerDetails(customer.getUserId() , customer.getUserName() , customer.getPassword() ,
				                                  customer.getAdharNo() , customer.getAddressLine() , customer.getCity() ,
				                                  customer.getPincode() , customer.getContactNo());
		
		custrepo.save(obj);
		
		return "You are registered successfully";
	}
	
	@GetMapping("/getcustomer/{custid}")
	public CustomerDetails getCustomerById(@PathVariable int custid)
	{
		Optional<CustomerDetails> obj = custrepo.findById(custid);
		
		return obj.get();
	}
	
	@GetMapping("/getallcustomers")
	public List<CustomerDetails> getAllCustomers()
	{
		List<CustomerDetails> list = custrepo.findAll();
		
		return list;
	}
	
	@DeleteMapping("removecustomer/{customerId}")
	public String removeCustomer(@PathVariable("customerId") int id)
	{
		custrepo.deleteById(id);
		
		return "Customer is get Removed";
	}
	
	@PutMapping("/updateprofile")
	public String updateProfile(@RequestBody CustomerDetails customer)
	{
		CustomerDetails obj = new CustomerDetails(customer.getUserId() , customer.getUserName() , customer.getPassword() ,
                                                  customer.getAdharNo() , customer.getAddressLine() , customer.getCity() ,
                                                  customer.getPincode() , customer.getContactNo());

        custrepo.save(obj);

        return "Your profile get updated successfully";
	}
	
}
