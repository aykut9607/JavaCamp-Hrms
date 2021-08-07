package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.JobPosition;

public interface IJobPositionDao extends JpaRepository<JobPosition,Integer>{

}
