 package com.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dtos.DeliveryAddressDto;
import com.project.dtos.Response;
import com.project.services.DeliveryAddressService;

@CrossOrigin(origins = "*")
@RestController
public class DeliveryAddressController {

	@Autowired
	DeliveryAddressService deliveryAddressService;
	
	@PostMapping("/deliveryAddress/{id}")
	public ResponseEntity<?> displayDeliveryAddressById(@PathVariable("id") int id) {
		DeliveryAddressDto deliveryAddressDto = deliveryAddressService.findByLocationId(id);
		return Response.success(deliveryAddressDto);
	}
	
	@PostMapping("/deliveryAddress/add")
	   public ResponseEntity<?> addDeliveryAddress(@RequestBody DeliveryAddressDto dto){
		
	       Map<String, Object> result = deliveryAddressService.addDeliveryAddress(dto);
	       return Response.success(result);
	   }
	@GetMapping("/deliveryAddress")
	public ResponseEntity<?> getDeliveryAddress()
	{
		List<DeliveryAddressDto> list = deliveryAddressService.findAll();
		return Response.success(list);
	}
	
}
