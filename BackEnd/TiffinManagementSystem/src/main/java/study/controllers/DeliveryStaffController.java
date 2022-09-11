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

import study.entities.DeliveryStaffDetails;
import study.repository.DeliveryStaffRepository;

@RestController
public class DeliveryStaffController {

	@Autowired
	DeliveryStaffRepository delrepo;
	
	@PostMapping("/adddeliverystaff")
	public String addCustomer(@RequestBody DeliveryStaffDetails delstaff) 
	{
		DeliveryStaffDetails obj = new DeliveryStaffDetails(delstaff.getUserId() , delstaff.getUserName() , delstaff.getPassword() ,
				                                            delstaff.getAdharNo() , delstaff.getAddressLine() , delstaff.getCity() ,
				                                            delstaff.getPincode() , delstaff.getContactNo());
		
		delrepo.save(obj);
		
		return "You are registered successfully";
	}
	
	@GetMapping("/getdelstaff/{delid}")
	public DeliveryStaffDetails getDeliveryStaffById(@PathVariable int delid)
	{
		Optional<DeliveryStaffDetails> obj = delrepo.findById(delid);
		
		return obj.get();
	}
	
	@GetMapping("/getalldeliverystaff")
	public List<DeliveryStaffDetails> getAllDeliveryStaff()
	{
		List<DeliveryStaffDetails> list = delrepo.findAll();
		
		return list;
	}
	
	@DeleteMapping("removedeliverystaff/{delId}")
	public String removeVendor(@PathVariable("delId") int id)
	{
		delrepo.deleteById(id);
		
		return "DeliveryStaff is get Removed";
	}
	
	@PutMapping("/updateprofile")
	public String updateProfile(@RequestBody DeliveryStaffDetails delstaff)
	{
		DeliveryStaffDetails obj = new DeliveryStaffDetails(delstaff.getUserId() , delstaff.getUserName() , delstaff.getPassword() ,
				                                            delstaff.getAdharNo() , delstaff.getAddressLine() , delstaff.getCity() ,
				                                            delstaff.getPincode() , delstaff.getContactNo());

		delrepo.save(obj);

        return "Your profile get updated successfully";
	}
}
