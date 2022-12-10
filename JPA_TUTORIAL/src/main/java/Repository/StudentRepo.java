package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>
{
	
}
