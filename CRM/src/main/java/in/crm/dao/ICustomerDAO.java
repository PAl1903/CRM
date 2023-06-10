package in.crm.dao;

import org.springframework.data.repository.CrudRepository;

import in.crm.model.Customer;

public interface ICustomerDAO extends CrudRepository<Customer, Integer> {

}
