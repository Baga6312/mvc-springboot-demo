package org.tuniway.tp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tuniway.tp1.Models.Customer;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT c FROM Customer c WHERE c.city= :city")
    List<Customer> findCustomerByCity(@Param("email") String city);

    @Query("SELECT c FROM Customer c WHERE c.address = :address")
    List<Customer> findCustomerByAddress(String address);

    Customer createCustomer(String city);
    Customer updateCustomer(String city);
    void deleteCustomer(String city);
}
