package liveasy.assignment.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import liveasy.assignment.demo.entity.Load;

@Service
interface LoadServices {
   
	public List<Load> getLoad();
	public Load getLoad(long id);
	public void addLoad(Load load);
	public void updateLoad(Load load);
	public void deleteLoad(long id);
	
}
