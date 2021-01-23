package lk.ijse.pos.hibernate.business.custom.impl;

import lk.ijse.pos.hibernate.business.custom.ItemBO;
import lk.ijse.pos.hibernate.dao.DAOFactory;
import lk.ijse.pos.hibernate.dao.DAOType;
import lk.ijse.pos.hibernate.dao.custom.impl.ItemDAOImpl;
import lk.ijse.pos.hibernate.dto.ItemDTO;
import lk.ijse.pos.hibernate.entity.Item;

public class ItemBOImpl implements ItemBO {

    ItemDAOImpl itemDAO = DAOFactory.getInstance().getDAO(DAOType.ITEM);

    @Override
    public boolean add(ItemDTO itemDTO) throws Exception {
        return itemDAO.add(new Item(
                itemDTO.getCode(),
                itemDTO.getDescription(),
                itemDTO.getUnitPrice(),
                itemDTO.getQty()
        ));

    }
}
