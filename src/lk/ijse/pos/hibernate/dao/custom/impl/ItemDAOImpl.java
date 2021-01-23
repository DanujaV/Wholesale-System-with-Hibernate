package lk.ijse.pos.hibernate.dao.custom.impl;

import lk.ijse.pos.hibernate.dao.custom.ItemDAO;
import lk.ijse.pos.hibernate.entity.Item;
import lk.ijse.pos.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ItemDAOImpl implements ItemDAO{
    @Override
    public boolean add(Item entity) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        return true;
    }

    @Override
    public boolean update(Item entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public Item find(String s) throws Exception {
        return null;
    }

    @Override
    public List<Item> findAll() throws Exception {
        return null;
    }
}
