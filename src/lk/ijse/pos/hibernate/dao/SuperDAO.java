package lk.ijse.pos.hibernate.dao;

import lk.ijse.pos.hibernate.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;

public interface SuperDAO <Entity extends SuperEntity, ID extends Serializable>{
    public default boolean add(Entity entity) throws Exception {
        return false;
    }

    public boolean update(Entity entity, ID id) throws Exception;

    public boolean delete(ID id) throws Exception;

    public Entity find(String id) throws Exception;

    public List<Entity> getAll() throws Exception;
}
