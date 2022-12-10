package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;



@Data

@Table(
		uniqueConstraints = @UniqueConstraint(
					columnNames = "studentEmail"
				)

		)
@Entity(name = "student")
public class Student 
{
	@Id
	private int id;
	private String firstName;
	private String lastName;
	
	//@Column(name = "studentEmail",nullable=false)
	@Column(name = "studentEmail")
	private String emailId;
	  
	private String guardianName;
	
}
 