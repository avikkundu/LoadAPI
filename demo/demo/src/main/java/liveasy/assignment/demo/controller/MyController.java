package liveasy.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import liveasy.assignment.demo.entity.Load;
import liveasy.assignment.demo.services.LoadServicesImpl;

@RestController
public class MyController {
	
	@Autowired
	private LoadServicesImpl loadServices;
	
	@PostMapping("/load")
	public String addload(@RequestBody Load load)
	{
		loadServices.addLoad(load);
		return "loads details added successfully\n";
	}
    
	@GetMapping("/load")
	public List<Load> getLoad()
	{
		return loadServices.getLoad();
	}
	
	@GetMapping("load/{loadId}")
	public Load getSpcLoad(@PathVariable String loadId)
	{
		return loadServices.getLoad(Long.parseLong(loadId));
	}
	
	@DeleteMapping("/load/{loadId}")
	public String deleteLoad(@PathVariable String loadId)
	{
		loadServices.deleteLoad(Long.parseLong(loadId));
		return "loads details deleted successfully";
	}
	
	@PutMapping("/load/{loadId}")
	public void updateLoad(@RequestBody Load load)
	{
		loadServices.updateLoad(load);
	}
	
}
