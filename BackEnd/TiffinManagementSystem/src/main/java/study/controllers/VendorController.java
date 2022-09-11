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

import study.entities.VendorDetails;
import study.repository.VendorRepository;

@RestController
public class VendorController {

	@Autowired
	VendorRepository vendrepo;
	
	@PostMapping("/addvendor")
	public String addCustomer(@RequestBody VendorDetails vendor) 
	{
		VendorDetails obj = new VendorDetails(vendor.getUserId() , vendor.getUserName() , vendor.getPassword() ,
				                              vendor.getAdharNo() , vendor.getAddressLine() , vendor.getCity() ,
				                              vendor.getPincode() , vendor.getContactNo());
		
		vendrepo.save(obj);
		
		return "You are registered successfully";
	}
	
	@GetMapping("/getvendor/{vendid}")
	public VendorDetails getCustomerById(@PathVariable int custid)
	{
		Optional<VendorDetails> obj = vendrepo.findById(custid);
		
		return obj.get();
	}
	
	@GetMapping("/getallvendors")
	public List<VendorDetails> getAllVendors()
	{
		List<VendorDetails> list = vendrepo.findAll();
		
		return list;
	}
	
	@DeleteMapping("removevendor/{vendorId}")
	public String removeVendor(@PathVariable("vendorId") int id)
	{
		vendrepo.deleteById(id);
		
		return "Vendor is get Removed";
	}
	
	@PutMapping("/updateprofile")
	public String updateProfile(@RequestBody VendorDetails vendor)
	{
		VendorDetails obj = new VendorDetails(vendor.getUserId() , vendor.getUserName() , vendor.getPassword() ,
				                              vendor.getAdharNo() , vendor.getAddressLine() , vendor.getCity() ,
				                              vendor.getPincode() , vendor.getContactNo());

		vendrepo.save(obj);

        return "Your profile get updated successfully";
	}
}
