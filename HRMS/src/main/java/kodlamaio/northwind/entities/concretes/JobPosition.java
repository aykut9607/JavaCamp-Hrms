package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="system_workers")
public class JobPosition {
	
	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name="job_position")
	private String jobPosition;

	public JobPosition() {}
	
	public JobPosition(int id, String jobPosition) {
		super();
		this.id = id;
		this.jobPosition = jobPosition;
	}
}
