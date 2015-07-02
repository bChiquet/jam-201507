package fr.arolla.jam.webapp.repository;

import fr.arolla.jam.webapp.domain.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Page<Employee> findAll(Pageable pageable);

}
