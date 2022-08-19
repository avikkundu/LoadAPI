package liveasy.assignment.demo.services;

import java.util.List;

import liveasy.assignment.demo.entity.Load;

interface LoadServices {
   
	public List<Load> getLoad();
	public Load getLoad(long id);
	public void addLoad(Load load);
	public void updateLoad(Load load);
	public void deleteLoad(long id);
	
}
