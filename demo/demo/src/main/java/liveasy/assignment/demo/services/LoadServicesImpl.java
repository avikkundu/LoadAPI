package liveasy.assignment.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import liveasy.assignment.demo.Dao.LoadDao;
import liveasy.assignment.demo.entity.Load;

@Service
public class LoadServicesImpl implements LoadServices{

	@Autowired
	private LoadDao loadDao;
	
	@Override
	public List<Load> getLoad() {
		
		return loadDao.findAll();
	}
    
	@Override
	public void addLoad(Load load) {
		// TODO Auto-generated method stub
		loadDao.save(load);
		
	}

	@Override
	public void updateLoad(Load load) {
		// TODO Auto-generated method stub
		loadDao.save(load);
		
	}

	@Override
	public void deleteLoad(long id) {
		// TODO Auto-generated method stub
		Load lld=loadDao.getOne(id);
		loadDao.delete(lld);
		
	}

	@Override
	public Load getLoad(long id) {
		// TODO Auto-generated method stub
		return loadDao.getOne(id);
	}

}
