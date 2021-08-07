package kodlamaio.northwind.api.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.IJobPositionService;
import kodlamaio.northwind.entities.concretes.JobPosition;
@RestController
@RequestMapping("/api/system_workers")

public class JobPositionController {
	private IJobPositionService  JobPositionService;
	
	@Autowired
	public JobPositionController(IJobPositionService jobPositionService) {
		super();
		JobPositionService = jobPositionService;
	}

	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.JobPositionService.getAll();
	}
}
