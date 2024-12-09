package com.eCommerce.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;
//import com.eCommerce.springboot.Customers;
@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {
}
