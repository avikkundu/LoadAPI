package liveasy.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import liveasy.assignment.demo.entity.Load;
import liveasy.assignment.demo.services.LoadServicesImpl;

@RestController
public class MyController {
	
	@Autowired
	private LoadServicesImpl loadServices;
	
	@PostMapping("/load")
	public void addload()
	{
		
	}
    
	@GetMapping("/load")
	public List<Load> getLoad()
	{
		return null;
	}
	
	@PutMapping("load/{loadId}")
	public void getSpcLoad(@PathVariable String loadId)
	{
		
	}
	
	@DeleteMapping("/load/{loadId}")
	public void deleteLoad(@PathVariable String loadId)
	{
		loadServices.deleteLoad(Long.parseLong(loadId));	
	}
	
	@PutMapping("/load/{loadId}")
	public void updateLoad(@PathVariable String loadId)
	{
		loadServices.updateLoad(Long.parseLong(loadId));
	}
	
}
