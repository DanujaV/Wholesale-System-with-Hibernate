package lk.ijse.pos.hibernate.business.custom;

import lk.ijse.pos.hibernate.business.SuperBO;
import lk.ijse.pos.hibernate.dto.ItemDTO;

public interface ItemBO extends SuperBO {
    public boolean add(ItemDTO itemDTO) throws Exception;
}
