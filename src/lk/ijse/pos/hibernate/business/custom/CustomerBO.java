package lk.ijse.pos.hibernate.business.custom;

import lk.ijse.pos.hibernate.business.SuperBO;
import lk.ijse.pos.hibernate.dto.CustomerDTO;

public interface CustomerBO extends SuperBO {
    public boolean add(CustomerDTO customerDTO) throws Exception;
}
