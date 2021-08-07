package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.business.abstracts.IJobPositionService;
import kodlamaio.northwind.dataAccess.abstracts.IJobPositionDao;
import kodlamaio.northwind.entities.concretes.JobPosition;
import org.springframework.stereotype.Service; 
@Service
public class JobPositionManager implements IJobPositionService{

	private IJobPositionDao jobPositionDao;
	
	@Autowired	
	public JobPositionManager(IJobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}
	
	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

}
