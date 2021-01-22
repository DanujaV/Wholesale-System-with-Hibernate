package lk.ijse.pos.hibernate.business.custom.impl;

import lk.ijse.pos.hibernate.business.custom.CustomerBO;
import lk.ijse.pos.hibernate.dao.DAOFactory;
import lk.ijse.pos.hibernate.dao.DAOType;
import lk.ijse.pos.hibernate.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.pos.hibernate.dto.CustomerDTO;
import lk.ijse.pos.hibernate.entity.Customer;

public class CustomerBOImpl implements CustomerBO {

    CustomerDAOImpl customerDAO = DAOFactory.getInstance().getDAO(DAOType.CUSTOMER);

    @Override
    public boolean add(CustomerDTO customerDTO) throws Exception {
        return customerDAO.add(new Customer(
           customerDTO.getId(),
           customerDTO.getName(),
           customerDTO.getAddress(),
           customerDTO.getSalary()
        ));
    }
}
