package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entities.VendorDetails;

@Repository
public interface VendorRepository extends JpaRepository<VendorDetails , Integer> {

}
