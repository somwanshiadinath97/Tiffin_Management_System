package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entities.CustomerDetails;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails , Integer> {

}
