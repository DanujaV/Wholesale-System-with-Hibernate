package lk.ijse.pos.hibernate.dao.custom.impl;

import lk.ijse.pos.hibernate.dao.custom.CustomerDAO;
import lk.ijse.pos.hibernate.entity.Customer;
import lk.ijse.pos.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean add(Customer entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.getTransaction();

        session.save(entity);

        transaction.commit();
        return true;
    }

    @Override
    public boolean update(Customer entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public Customer find(String s) throws Exception {
        return null;
    }

    @Override
    public List<Customer> findAll() throws Exception {
        return null;
    }
}
