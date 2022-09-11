package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entities.DeliveryStaffDetails;

@Repository
public interface DeliveryStaffRepository extends JpaRepository<DeliveryStaffDetails , Integer>{

}
